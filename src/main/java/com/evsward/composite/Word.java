package com.evsward.composite;

import java.util.List;

public class Word extends LetterComposite {
	public Word(List<Letter> letters) {
		letters.forEach(p -> this.add(p));
	}

	@Override
	protected void doBefore() {
		System.out.print(" ");
	}

	@Override
	protected void doAfter() {
		// nop
	}

}
