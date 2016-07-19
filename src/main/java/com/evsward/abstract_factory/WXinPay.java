package com.evsward.abstract_factory;

public class WXinPay implements Pay {

	@Override
	public String doPay() {
		System.out.println("weixin do pay now in detail, communicate with the server of zfb...");
		return null;
	}

}
