package com.evsward.builder;

public class App {
	public static void main(String[] args) {
		Warcraft first = new Warcraft.Builder("F-86", Generation.First).withAutocannon(Autocannon.MK108)
				.withBomb(Bomb.TORPEDO).isVisible(Visibility.VISIBLE).build();
		System.out.println(first);
		Warcraft second = new Warcraft.Builder("F-104", Generation.Second).withMissile(Missile.MRBM).build();
		System.out.println(second);
		Warcraft third = new Warcraft.Builder("F-4", Generation.Third).withAutocannon(Autocannon.GIAT30)
				.withBomb(Bomb.DEPTH_CHARGE).withMissile(Missile.SRBM).build();
		System.out.println(third);
		Warcraft fourth = new Warcraft.Builder("歼-10", Generation.Fourth).withAutocannon(Autocannon.Gatlin)
				.isVisible(Visibility.VISIBLE).withBomb(Bomb.LRGB).withMissile(Missile.IRBM).build();
		System.out.println(fourth);
		Warcraft fifth = new Warcraft.Builder("歼-20", Generation.Fifth).isVisible(Visibility.INVISIBLE)
				.withAutocannon(Autocannon.Gatlin).withBomb(Bomb.TORPEDO).withMissile(Missile.IRBM).build();
		System.out.println(fifth);
	}
}
