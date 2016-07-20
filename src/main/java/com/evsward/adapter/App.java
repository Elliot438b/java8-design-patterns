package com.evsward.adapter;

public class App {
	/*
	 * Adapter pattern is for reusing class.
	 */
	public static void main(String[] args) {
		Leader leader = new Leader(new MilitiaFarmer());
		leader.shoot();
		leader.transport();
	}
}
