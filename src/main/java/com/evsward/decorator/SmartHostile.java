package com.evsward.decorator;

/**
 * the core class file of the decorate pattern!!!
 * 
 * @author xp020154
 *
 */
public class SmartHostile implements Hostile {

	// parent class instance, actually.
	private Hostile decorated;

	/*
	 * when construct, initial the decorated object, source object, will be
	 * decorated.
	 */
	public SmartHostile(Hostile decorated) {
		this.decorated = decorated;
	}

	@Override
	public void attack() {
		// decorate with something.
		System.out.println("It throws a rock at you!");
		// don't forget invoke the source function.
		decorated.attack();
	}

	@Override
	public int getAttackPower() {
		// decorated hostile's power + 20 because it is smart(I seriously -_-).
		return decorated.getAttackPower() + 20;
	}

	@Override
	public void fleeBattle() {
		// decorate with something.
		System.out.println("It calls for help!");
		// don't forget invoke the source function.
		decorated.fleeBattle();
	}

}
