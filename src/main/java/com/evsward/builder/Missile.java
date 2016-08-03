package com.evsward.builder;

public enum Missile {
	SRBM("short-range ballistic missile"), MRBM("medium-range ballistic missile"), IRBM(
			"intermediate-range ballistic missile");
	private String title;

	Missile(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
