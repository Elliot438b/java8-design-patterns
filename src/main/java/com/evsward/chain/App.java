package com.evsward.chain;

public class App {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.makeRequest(new Request(RequestType.FreezingFood, "I need to freeze a fish."));
		controller.makeRequest(new Request(RequestType.ReleaseColdAir, "I'm so hot that I need cold air now."));
		controller.makeRequest(new Request(RequestType.PlayingShows, "I want to watch a TV show."));
	}
}
