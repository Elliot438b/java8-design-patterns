package com.evsward.command;

public class App {
	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Goblin goblin = new Goblin();
		Hobbit hobbit = new Hobbit();

		goblin.printStatus();
		hobbit.printStatus();

		wizard.invokeCommand(new DoShrink(), goblin);
		goblin.printStatus();
		wizard.invokeCommand(new DoHide(), goblin);
		goblin.printStatus();

		// wizard.invokeCommand(new DoShrink(), hobbit);
		// hobbit.printStatus();
		// wizard.invokeCommand(new DoHide(), hobbit);
		// hobbit.printStatus();
		// goblin.printStatus();
		wizard.undoLastCommand();
		goblin.printStatus();
		// hobbit.printStatus();

		wizard.undoLastCommand();
		goblin.printStatus();

		wizard.redoLaskCommand();
		goblin.printStatus();
		wizard.redoLaskCommand();
		goblin.printStatus();
	}
}
