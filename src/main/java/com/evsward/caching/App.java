package com.evsward.caching;

public class App {

	/**
	 * Program entry point
	 *
	 * @param args
	 *            command line args
	 */
	public static void main(String[] args) {
		AppManager.initDb(true); // VirtualDB (instead of MongoDB) was used in
									// running the JUnit tests
									// and the App class to avoid Maven
									// compilation errors. Set flag to
									// true to run the tests with MongoDB
									// (provided that MongoDB is
									// installed and socket connection is open).
		AppManager.initCacheCapacity(3);
		App app = new App();
		app.useReadAndWriteThroughStrategy();
		app.useReadThroughAndWriteAroundStrategy();
		app.useReadThroughAndWriteBehindStrategy();
	}

	/**
	 * Read-through and write-through
	 */
	public void useReadAndWriteThroughStrategy() {
		System.out.println("# CacheType.THROUGH");
		AppManager.initCachingPolicy(CacheType.THROUGH);

		UserAccount userAccount1 = new UserAccount("001", "John", "He is a boy.");

		AppManager.save(userAccount1);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("001");
		AppManager.find("001");
	}

	/**
	 * Read-through and write-around write-around: set to the db but not set to
	 * the cache.
	 */
	public void useReadThroughAndWriteAroundStrategy() {
		System.out.println("# CacheType.AROUND");
		AppManager.initCachingPolicy(CacheType.AROUND);

		UserAccount userAccount2 = new UserAccount("002", "Jane", "She is a girl.");

		AppManager.save(userAccount2);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("002");
		System.out.println(AppManager.printCacheContent());
		userAccount2 = AppManager.find("002");
		userAccount2.setUserName("Jane G.");
		AppManager.save(userAccount2);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("002");
		System.out.println(AppManager.printCacheContent());
		AppManager.find("002");
	}

	/**
	 * Read-through and write-behind
	 */
	public void useReadThroughAndWriteBehindStrategy() {
		System.out.println("# CacheType.BEHIND");
		AppManager.initCachingPolicy(CacheType.BEHIND);

		UserAccount userAccount3 = new UserAccount("003", "Adam", "He likes food.");
		UserAccount userAccount4 = new UserAccount("004", "Rita", "She hates cats.");
		UserAccount userAccount5 = new UserAccount("005", "Isaac", "He is allergic to mustard.");

		AppManager.save(userAccount3);
		AppManager.save(userAccount4);
		AppManager.save(userAccount5);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("003");
		System.out.println(AppManager.printCacheContent());
		UserAccount userAccount6 = new UserAccount("006", "Yasha", "She is an only child.");
		AppManager.save(userAccount6);
		System.out.println(AppManager.printCacheContent());
		AppManager.find("004");
		System.out.println(AppManager.printCacheContent());
	}

}
