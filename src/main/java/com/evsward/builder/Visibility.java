package com.evsward.builder;

public enum Visibility {
	VISIBLE("visible"), INVISIBLE("invisible");
	private String title;

	Visibility(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
