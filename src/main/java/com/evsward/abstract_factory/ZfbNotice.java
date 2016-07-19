package com.evsward.abstract_factory;

public class ZfbNotice implements Notice{

	@Override
	public String doNotice() {
		System.out.println("zfb do notice!");
		System.out.println("It's been sent already, recieve the notice message for now...");
		return null;
	}

}
