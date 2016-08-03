package com.evsward.builder;

public enum Bomb {
	TORPEDO("antisubmarine torpedo"), DEPTH_CHARGE("depth charge"), LRGB("long-range glide bomb");
	private String title;

	Bomb(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
