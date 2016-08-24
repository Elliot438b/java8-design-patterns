package com.evsward.delegation;

import com.evsward.delegation.printer.CanonPrinter;
import com.evsward.delegation.printer.EpsonPrinter;
import com.evsward.delegation.printer.HpPrinter;

public class App {
	public static void main(String[] args) {
		PrintController CanonPrinter = new PrintController(new CanonPrinter());
		PrintController EpsonPrinter = new PrintController(new EpsonPrinter());
		PrintController HpPrinter = new PrintController(new HpPrinter());
		CanonPrinter.print("A");
		EpsonPrinter.print("B");
		HpPrinter.print("C");
	}
}
