package com.evsward.bridge;

public class ZhuangZi extends YellowRaceHumanbeingImpl {

	@Override
	public void think() {
		System.out.println("I can think very deeply.");
	}

	@Override
	public void eat() {
		System.out.println("ZhuangZi eat.");
	}

	@Override
	public void drink() {
		System.out.println("ZhuangZi drink.");
	}

	@Override
	public void sleep() {
		System.out.println("ZhuangZi sleep.");
	}

}
