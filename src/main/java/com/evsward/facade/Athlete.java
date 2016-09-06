package com.evsward.facade;

/**
 * 这是父类，父类一般定义为抽象类，有助于将一部分公用方法的实现提取出来，而定义一些强制需要子类去具体实现的方法。
 * 
 * @author xp020154
 *
 */
public abstract class Athlete {
	public void gather() {
		System.out.println(item() + " gather now!");
	}

	public void train() {
		System.out.println(item() + " begin to train.");
	}

	public void meal() {
		System.out.println(item() + " have meals.");
	}

	public void course() {
		System.out.println(item() + " attend class.");
	}

	public abstract String item();

	public abstract void warmUp();

	static enum Action {
		GATHER, TRAIN, MEAL, COURSE, WARM_UP
	}

	private void action(Action action) {
		switch (action) {
		case GATHER:
			gather();
			break;
		case TRAIN:
			train();
			break;
		case MEAL:
			meal();
			break;
		case COURSE:
			course();
			break;
		case WARM_UP:
			warmUp();
			break;
		default:
			System.out.println("Undefined action.");
			break;
		}
	}

	/**
	 * 表示此处接受的参数为0到多个Object类型的对象，或者是一个Object[]。
	 * 
	 * @param actions
	 */
	public void action(Action... actions) {
		for (Action action : actions) {
			action(action);
		}
	}
}
