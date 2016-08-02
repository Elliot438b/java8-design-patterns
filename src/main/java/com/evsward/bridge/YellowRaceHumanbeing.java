package com.evsward.bridge;

public class YellowRaceHumanbeing extends Humanbeing {

	public YellowRaceHumanbeing(YellowRaceHumanbeingImpl imp) {
		super(imp);
	}

	@Override
	public YellowRaceHumanbeingImpl getImp() {
		return (YellowRaceHumanbeingImpl) imp;
	}

	@Override
	public void eat() {
		getImp().eat();
	}

	@Override
	public void drink() {
		getImp().drink();
	}

	@Override
	public void sleep() {
		getImp().sleep();
	}

	public void think() {
		getImp().think();
	}

}
