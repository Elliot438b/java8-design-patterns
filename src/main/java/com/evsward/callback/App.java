package com.evsward.callback;

public class App {
	public static void main(String[] args) {
		Task task = new SimpleTask();
		Callback callback = new Callback() {

			@Override
			public void call() {
				System.out.println("I'm done now.");
			}

		};
		task.executeWith(callback);
	}
}
