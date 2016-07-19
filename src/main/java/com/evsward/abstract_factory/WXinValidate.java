package com.evsward.abstract_factory;

public class WXinValidate implements Validation {

	@Override
	public String doValidate() {
		System.out.println("weixin protacol validate datas...");
		return null;
	}

}
