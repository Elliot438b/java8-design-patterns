package com.evsward.command;

public enum Size {

	SMALL("small"), NORMAL("normal"), LARGE("large"), UNDEFINED("");
	private String title;

	private Size(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
