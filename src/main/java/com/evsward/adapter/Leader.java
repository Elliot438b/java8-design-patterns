package com.evsward.adapter;

/**
 * That's a class which is provided to the others to use the new class and its new function.
 * @author xp020154
 *
 */
public class Leader implements Militia {

	private MilitiaFarmer soldier;

	public Leader() {
	}

	public Leader(MilitiaFarmer soldier) {
		this.soldier = soldier;
	}

	public void setMilitiaFarmer(MilitiaFarmer soldier) {
		this.soldier = soldier;
	}

	@Override
	public void shoot() {
		soldier.shoot();
	}

	@Override
	public void transport() {
		soldier.transport();
	}

}
