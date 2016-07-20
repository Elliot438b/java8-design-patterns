package com.evsward.adapter;

/**
 * new class to implements the new Interface, keep the function you want to keep of the old class.
 * implements the new function by yourself.
 * @author xp020154
 *
 */
public class MilitiaFarmer implements Militia {
	private Farmer farmer;

	public MilitiaFarmer() {
		this.farmer = new Farmer();
	}

	@Override
	public void shoot() {
		System.out.println("I become a soldier, I learn how to shoot.");
	}

	@Override
	public void transport() {
		farmer.transport();
	}

}
