package com.evsward.facade;

public class Gymnast extends Athlete {

	@Override
	public String item() {
		return "Gymnast";
	}

	@Override
	public void warmUp() {
		System.out.println(item() + " do 20 back flips to warm up.");
	}

}
