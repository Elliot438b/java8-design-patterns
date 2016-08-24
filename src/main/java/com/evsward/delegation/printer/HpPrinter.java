package com.evsward.delegation.printer;

import com.evsward.delegation.Printer;

public class HpPrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Hp Printer: " + message);
	}

}
