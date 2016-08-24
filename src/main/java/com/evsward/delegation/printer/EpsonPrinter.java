package com.evsward.delegation.printer;

import com.evsward.delegation.Printer;

public class EpsonPrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Epson Printer: " + message);
	}

}
