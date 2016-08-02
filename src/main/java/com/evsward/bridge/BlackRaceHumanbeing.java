package com.evsward.bridge;

public class BlackRaceHumanbeing extends Humanbeing {

	public BlackRaceHumanbeing(BlackRaceHumanbeingImpl imp) {
		super(imp);
	}

	@Override
	public BlackRaceHumanbeingImpl getImp() {
		return (BlackRaceHumanbeingImpl) imp;
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

	public void run() {
		getImp().run();
	}

}
