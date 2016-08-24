package com.evsward.delegation;
/**
 * 1. This is the main class in the delegation pattern.
 * 2. This is the delegate class.
 * 3. This implements Printer but haven't provided any implementations.
 * 4. The caller doesn't care of the implementing only use this controller.
 * @author xp020154
 *
 */
public class PrintController implements Printer {
	private Printer printer;

	public PrintController(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print(String message) {
		printer.print(message);
	}

}
