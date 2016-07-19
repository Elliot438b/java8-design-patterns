package com.evsward.abstract_factory;

public class WXinPayChannel implements PayChannelFactory {

	@Override
	public Validation doValidation() {
		return new WXinValidate();
	}

	@Override
	public Pay doPay() {
		return new WXinPay();
	}

	@Override
	public Notice doNotice() {
		return new WXinNotice();
	}

}
