package com.evsward.dependency_injection;

public class SimpleWizard implements Wizard {

	private OldToByToBacco tobacco = new OldToByToBacco();

	@Override
	public void smoke() {
		tobacco.smoke(this);
	}

}
