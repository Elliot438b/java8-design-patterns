package com.evsward.bridge;

public class App {
	public static void main(String[] args) {
		YellowRaceHumanbeing yellowRaceHumanbeing = new YellowRaceHumanbeing(new ZhuangZi());
		yellowRaceHumanbeing.eat();
		yellowRaceHumanbeing.drink();
		yellowRaceHumanbeing.sleep();
		yellowRaceHumanbeing.think();
		BlackRaceHumanbeing blackRaceHumanbeing = new BlackRaceHumanbeing(new UsainBolt());
		blackRaceHumanbeing.eat();
		blackRaceHumanbeing.drink();
		blackRaceHumanbeing.sleep();
		blackRaceHumanbeing.run();
		WhiteRaceHumanbeing whiteRaceHumanbeing = new WhiteRaceHumanbeing(new PaulAnderson());
		whiteRaceHumanbeing.eat();
		whiteRaceHumanbeing.drink();
		whiteRaceHumanbeing.sleep();
		whiteRaceHumanbeing.weightlift();
	}
}
