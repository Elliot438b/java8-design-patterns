package com.evsward.delegation.printer;

import com.evsward.delegation.Printer;

public class CanonPrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Canon Printer: " + message);
	}

}
