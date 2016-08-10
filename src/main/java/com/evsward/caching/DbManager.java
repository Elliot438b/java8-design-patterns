package com.evsward.caching;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;

/**
 * MongoDB client some tools in java implements.
 * 
 * @author xp020154
 *
 */
public final class DbManager {
	private static MongoClient mongoClient;
	private static MongoDatabase db;
	private static boolean useMongoDB;

	private static Map<String, UserAccount> virtualDB;

	private DbManager() {
	}

	public static void createVirtualDb() {
		useMongoDB = false;
		virtualDB = new HashMap<>();
	}

	public static void connect() throws ParseException {
		useMongoDB = true;
		mongoClient = new MongoClient();
		db = mongoClient.getDatabase("test");
	}

	public static UserAccount readFromDb(String userId) {
		if (!useMongoDB) {
			if (virtualDB.containsKey(userId)) {
				return virtualDB.get(userId);
			}
			return null;
		}
		if (null == db) {
			try {
				connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		FindIterable<Document> iterable = db.getCollection("user_accounts").find(new Document("userID", userId));
		if (iterable == null) {
			return null;
		}
		Document doc = iterable.first();
		return new UserAccount(userId, doc.getString("userName"), doc.getString("briefIntro"));
	}

	public static void writeToDb(UserAccount userAccount) {
		if (!useMongoDB) {
			virtualDB.put(userAccount.getUserId(), userAccount);
			return;
		}
		if (null == db) {
			try {
				connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").insertOne(new Document("userID", userAccount.getUserId())
				.append("userName", userAccount.getUserName()).append("briefIntro", userAccount.getBriefIntro()));
	}

	public static void updateDb(UserAccount userAccount) {
		if (!useMongoDB) {
			virtualDB.put(userAccount.getUserId(), userAccount);
			return;
		}
		if (null == db) {
			try {
				connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").updateOne(new Document("userID", userAccount.getUserId()), new Document(
				"$set",
				new Document("userName", userAccount.getUserName()).append("briefIntro", userAccount.getBriefIntro())));
	}

	public static void upsertDb(UserAccount userAccount) {
		if (!useMongoDB) {
			virtualDB.put(userAccount.getUserId(), userAccount);
			return;
		}
		if (null == db) {
			try {
				connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").updateOne(new Document("userID", userAccount.getUserId()),
				new Document("$set",
						new Document("userID", userAccount.getUserId()).append("userName", userAccount.getUserName())
								.append("briefIntro", userAccount.getBriefIntro())),
				// Set to true if a new document should be inserted if there are
				// no matches to the query filter.
				new UpdateOptions().upsert(true));
	}
}
