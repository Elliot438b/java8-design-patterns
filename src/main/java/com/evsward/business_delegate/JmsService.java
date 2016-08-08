package com.evsward.business_delegate;

public class JmsService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Jms Service is processing.");
	}

}
