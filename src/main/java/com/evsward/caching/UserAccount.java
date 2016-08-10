package com.evsward.caching;

public class UserAccount {
	private String userId;
	private String userName;
	private String briefIntro;

	public UserAccount(String userId, String userName, String briefIntro) {
		this.userId = userId;
		this.userName = userName;
		this.briefIntro = briefIntro;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBriefIntro() {
		return briefIntro;
	}

	public void setBriefIntro(String briefIntro) {
		this.briefIntro = briefIntro;
	}

	@Override
	public String toString() {
		return userId + ", " + userName + ", " + briefIntro + ".";
	}

}
