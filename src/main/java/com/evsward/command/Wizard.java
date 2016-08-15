package com.evsward.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * important: command's invoker and manager.
 * 
 * @author xp020154
 *
 */
public class Wizard {
	private Deque<Command> undoStack = new LinkedList<>();
	private Deque<Command> redoStack = new LinkedList<>();

	public Wizard() {
	}

	public void invokeCommand(Command command, Target target) {
		System.out.println(this + " casts " + command + " at " + target);
		command.execute(target);
		undoStack.offerLast(command);
	}

	public void undoLastCommand() {
		if (!undoStack.isEmpty()) {
			Command previous = undoStack.pollLast();
			redoStack.offerLast(previous);
			System.out.println(this + " undoes " + previous);
			previous.undo();
		}
	}

	public void redoLaskCommand() {
		if (!redoStack.isEmpty()) {
			Command previous = redoStack.pollLast();
			undoStack.offerLast(previous);
			System.out.println(this + " redoes " + previous);
			previous.redo();
		}
	}

	@Override
	public String toString() {
		return "Wizard";
	}
}
