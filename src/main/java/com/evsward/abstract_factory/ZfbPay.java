package com.evsward.abstract_factory;

public class ZfbPay implements Pay {

	@Override
	public String doPay() {
		System.out.println("zbf do pay now in detail, communicate with the server of zfb...");
		return null;
	}

}
