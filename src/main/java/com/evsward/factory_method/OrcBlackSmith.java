package com.evsward.factory_method;

public class OrcBlackSmith implements BlackSmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}
