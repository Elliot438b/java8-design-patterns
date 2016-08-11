package com.evsward.callback;

public class LambdasApp {
	public static void main(String[] args) {
		Task task = new SimpleTask();
		task.executeWith(() -> System.out.println("I'm done now"));
	}
}
