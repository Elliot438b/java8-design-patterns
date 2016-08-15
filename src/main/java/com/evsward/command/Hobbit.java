package com.evsward.command;

public class Hobbit extends Target {
	public Hobbit() {
		setSize(Size.SMALL);
		setVisibility(Visibility.INVISIBLE);
	}

	@Override
	public String toString() {
		return "Hobbit";
	}

}
