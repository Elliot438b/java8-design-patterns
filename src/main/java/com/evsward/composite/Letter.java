package com.evsward.composite;

public class Letter extends LetterComposite {

	private char c;

	public Letter(char c) {
		this.c = c;
	}

	@Override
	protected void doBefore() {
		System.out.print(c);
	}

	@Override
	protected void doAfter() {
		// nop
	}

}
