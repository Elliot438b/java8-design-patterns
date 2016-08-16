package com.evsward.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * the super abstract class, that's why there aren't any differences between the
 * part objects and the individual objects in this pattern.
 * 
 * @author xp020154
 *
 */
public abstract class LetterComposite {
	private List<LetterComposite> children = new ArrayList<>();

	public void add(LetterComposite letter) {
		children.add(letter);
	}

	public int count() {
		return children.size();
	}

	protected abstract void doBefore();

	protected abstract void doAfter();

	public void execute() {
		doBefore();
		/*
		 * Here is a problem, use lambda below can't work, but for loop is work
		 * well.
		 */
		// children.forEach(p -> execute());
		for (LetterComposite letter : children) {
			letter.execute();
		}
		doAfter();
	}
}
