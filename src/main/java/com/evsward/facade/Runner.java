package com.evsward.facade;

public class Runner extends Athlete {

	@Override
	public String item() {
		return "runners";
	}

	@Override
	public void warmUp() {
		System.out.println(item() + " run 1000m to warm up.");
	}

}
