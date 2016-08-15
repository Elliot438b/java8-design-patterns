package com.evsward.command;

/**
 * the specific command extends the abstract Command class. hide something.
 * 
 * @author xp020154
 *
 */
public class DoHide extends Command {
	private Visibility oldVisibility;
	private Target target;

	@Override
	public void execute(Target target) {
		oldVisibility = target.getVisibility();
		target.setVisibility(Visibility.INVISIBLE);
		this.target = target;
	}

	@Override
	public void undo() {
		if (oldVisibility != null && target != null) {
			Visibility temp = target.getVisibility();
			target.setVisibility(oldVisibility);
			oldVisibility = temp;
		}
	}

	@Override
	public void redo() {
		undo();
	}

	@Override
	public String toString() {
		return "do hide";
	}

}
