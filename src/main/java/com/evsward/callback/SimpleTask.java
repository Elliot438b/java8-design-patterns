package com.evsward.callback;

public class SimpleTask extends Task {

	@Override
	public void execute() {
		System.out.println("perform an important work and then do the callback method.");
	}

}
