package com.evsward.command;

public enum Visibility {
	VISIBLE("visible"), INVISIBLE("invisible"), UNDEFINED("");
	private String title;

	private Visibility(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
