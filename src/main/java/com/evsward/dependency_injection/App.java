package com.evsward.dependency_injection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
	public static void main(String[] args) {
		SimpleWizard simpleWizard = new SimpleWizard();
		simpleWizard.smoke();

		AdvancedWizard advanceWizard = new AdvancedWizard(new SecondBreakfastTobacco());
		advanceWizard.smoke();

		Injector injector = Guice.createInjector(new TobaccoModule());
		GuiceWizard guiceWizard = injector.getInstance(GuiceWizard.class);
		guiceWizard.smoke();
	}
}
