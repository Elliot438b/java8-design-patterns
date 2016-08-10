package com.evsward.caching;

import java.util.List;

public class DoCache {
	static LruCache cache;

	private DoCache() {
	}

	public static void initCapacity(int capacity) {
		if (null == cache) {
			cache = new LruCache(capacity);
		} else {
			cache.setCapacity(capacity);
		}
	}

	public static UserAccount readThrough(String userId) {
		if (cache.contains(userId)) {
			System.out.println("# Cache hit!");
			return cache.get(userId);
		}
		System.out.println("# Cache Miss!");
		UserAccount userAccount = DbManager.readFromDb(userId);
		cache.set(userId, userAccount);
		return userAccount;
	}

	public static void writeThrough(UserAccount userAccount) {
		if (cache.contains(userAccount.getUserId())) {
			DbManager.updateDb(userAccount);
		} else {
			DbManager.writeToDb(userAccount);
		}
		cache.set(userAccount.getUserId(), userAccount);
	}

	public static void writeAround(UserAccount userAccount) {
		if (cache.contains(userAccount.getUserId())) {
			DbManager.updateDb(userAccount);
			cache.invalidate(userAccount.getUserId());
		} else {
			DbManager.writeToDb(userAccount);
		}
	}

	public static UserAccount readThroughWithWriteBackPolicy(String userId) {
		if (cache.contains(userId)) {
			System.out.println("# Cache Hit!");
			return cache.get(userId);
		}
		System.out.println("# Cache miss!");
		UserAccount userAccount = DbManager.readFromDb(userId);
		if (cache.isFull()) {
			System.out.println("# Cache is Full! write lru data to DB...");
			UserAccount toBeWrittenToDb = cache.getLruData();
			DbManager.upsertDb(toBeWrittenToDb);
		}
		cache.set(userId, userAccount);
		return userAccount;
	}

	public static void writeBehind(UserAccount userAccount) {
		if (cache.isFull() && !cache.contains(userAccount.getUserId())) {
			System.out.println("# Cache is Full! Writing LRU data to DB...");
			UserAccount toBeWrittenToDb = cache.getLruData();
			DbManager.upsertDb(toBeWrittenToDb);
		}
		cache.set(userAccount.getUserId(), userAccount);
	}

	public static void clearCache() {
		if (null != cache) {
			cache.clear();
		}
	}

	public static void flushCache() {
		System.out.println("# flushCache");
		if (null == cache) {
			return;
		}
		List<UserAccount> listOfUserAccounts = cache.getCacheDataInListForm();
		for (UserAccount userAccount : listOfUserAccounts) {
			DbManager.upsertDb(userAccount);
		}
	}

	public static String print() {
		List<UserAccount> listOfUserAccounts = cache.getCacheDataInListForm();
		StringBuilder sb = new StringBuilder();
		sb.append("\n--CACHE CONTENT--\n");
		for (UserAccount userAccount : listOfUserAccounts) {
			sb.append(userAccount.toString() + "\n");
		}
		sb.append("------\n");
		return sb.toString();
	}
}
