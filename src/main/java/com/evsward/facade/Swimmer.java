package com.evsward.facade;

public class Swimmer extends Athlete {

	@Override
	public String item() {
		return "swimmers";
	}

	@Override
	public void warmUp() {
		System.out.println(item() + " swim 1000m to warm up.");
	}

}
