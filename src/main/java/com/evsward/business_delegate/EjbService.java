package com.evsward.business_delegate;

public class EjbService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Ejb service's processing.");
	}

}
