package com.evsward.factory_method;

public class App {
	private final BlackSmith blackSmith;

	public App(BlackSmith blackSmith) {
		this.blackSmith = blackSmith;
	}

	public static void main(String[] args) {
		App app = new App(new OrcBlackSmith());
		app.manufactureWeapons();

		app = new App(new ElfBlackSmith());
		app.manufactureWeapons();
	}

	private void manufactureWeapons() {
		Weapon weapon;
		weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
		System.out.println(weapon);
		weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
		System.out.println(weapon);
	}
}
