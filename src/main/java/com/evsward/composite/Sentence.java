package com.evsward.composite;

import java.util.List;

public class Sentence extends LetterComposite {
	public Sentence(List<Word> words) {
		words.forEach(p -> this.add(p));
	}

	@Override
	protected void doBefore() {
		// nop
	}

	@Override
	protected void doAfter() {
		System.out.println(".");
	}

}
