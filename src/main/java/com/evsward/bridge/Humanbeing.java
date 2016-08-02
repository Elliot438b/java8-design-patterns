package com.evsward.bridge;

public abstract class Humanbeing {
	protected HumanbeingImpl imp;

	public Humanbeing(HumanbeingImpl imp) {
		this.imp = imp;
	}

	public HumanbeingImpl getImp() {
		return imp;
	}

	public abstract void eat();

	public abstract void drink();

	public abstract void sleep();
}
