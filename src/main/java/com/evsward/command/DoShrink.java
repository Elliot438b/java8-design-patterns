package com.evsward.command;

/**
 * the specific command extends the abstract Command class. shrink something.
 * 
 * @author xp020154
 *
 */
public class DoShrink extends Command {
	private Size oldSize;
	private Target target;

	@Override
	public void execute(Target target) {
		oldSize = target.getSize();
		target.setSize(Size.SMALL);
		this.target = target;
	}

	@Override
	public void undo() {
		if (oldSize != null && target != null) {
			Size temp = target.getSize();
			target.setSize(oldSize);
			oldSize = temp;
		}
	}

	@Override
	public void redo() {
		/**
		 * if after undo(),the temp is newest to instead of the older. if not,
		 * redo means undo,to recover the older setting.
		 */
		undo();
	}

	@Override
	public String toString() {
		return "do shrink";
	}

}
