package com.evsward.abstract_factory;

public interface PayChannelFactory {
	Validation doValidation();

	Pay doPay();

	Notice doNotice();
}
