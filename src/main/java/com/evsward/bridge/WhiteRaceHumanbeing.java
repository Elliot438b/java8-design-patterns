package com.evsward.bridge;

public class WhiteRaceHumanbeing extends Humanbeing {

	public WhiteRaceHumanbeing(WhiteRaceHumanbeingImpl imp) {
		super(imp);
	}

	@Override
	public WhiteRaceHumanbeingImpl getImp() {
		return (WhiteRaceHumanbeingImpl) imp;
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

	public void weightlift() {
		getImp().weightlift();
	}

}
