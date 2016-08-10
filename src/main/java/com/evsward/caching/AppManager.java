package com.evsward.caching;

public class AppManager {
	private static CacheType cacheType;

	private AppManager() {
	}

	public static void initDb(boolean useMongoDb) {
		if (useMongoDb) {
			try {
				DbManager.connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			DbManager.createVirtualDb();
		}
	}

	public static void initCachingPolicy(CacheType type) {
		cacheType = type;
		if (cacheType == CacheType.BEHIND) {
			Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

				@Override
				public void run() {
					DoCache.flushCache();
				}
			}));
		}
		DoCache.clearCache();
	}

	public static void initCacheCapacity(int capacity) {
		DoCache.initCapacity(capacity);
	}

	public static UserAccount find(String userId) {
		if (cacheType == CacheType.THROUGH || cacheType == CacheType.AROUND) {
			return DoCache.readThrough(userId);
		} else if (cacheType == CacheType.BEHIND) {
			return DoCache.readThroughWithWriteBackPolicy(userId);
		}
		return null;
	}

	public static void save(UserAccount userAccount) {
		if (cacheType == CacheType.THROUGH) {
			DoCache.writeThrough(userAccount);
		} else if (cacheType == CacheType.AROUND) {
			DoCache.writeAround(userAccount);
		} else if (cacheType == CacheType.BEHIND) {
			DoCache.writeBehind(userAccount);
		}
	}

	public static String printCacheContent() {
		return DoCache.print();
	}
}
