package com.evsward.abstract_factory;

public class ZfbPayChannel implements PayChannelFactory {

	@Override
	public Validation doValidation() {
		return new ZfbValidate();
	}

	@Override
	public Pay doPay() {
		return new ZfbPay();
	}

	@Override
	public Notice doNotice() {
		return new ZfbNotice();
	}

}
