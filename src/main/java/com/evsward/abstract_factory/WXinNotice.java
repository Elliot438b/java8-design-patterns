package com.evsward.abstract_factory;

public class WXinNotice implements Notice{

	@Override
	public String doNotice() {
		System.out.println("weixin do notice!");
		System.out.println("It's been sent already, recieve the notice message for now...");
		return null;
	}

}
