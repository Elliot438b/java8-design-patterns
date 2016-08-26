package com.evsward.dependency_injection;

public class AdvancedWizard implements Wizard {

	private Tobacco tobacco;

	public AdvancedWizard(Tobacco tobacco) {
		this.tobacco = tobacco;
	}

	@Override
	public void smoke() {
		tobacco.smoke(this);
	}

}
