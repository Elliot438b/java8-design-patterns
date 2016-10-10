package com.evsward.factory_method;

public class ElfBlackSmith implements BlackSmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}

}
