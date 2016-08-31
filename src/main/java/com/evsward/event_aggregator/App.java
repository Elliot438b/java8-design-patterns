package com.evsward.event_aggregator;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		KingJoffrey kingJoffrey = new KingJoffrey();
		KingsHand kingsHand = new KingsHand(kingJoffrey);

		List<EventEmitter> emitters = new ArrayList<>();
		emitters.add(kingsHand);
		// 每个Emitter在创建的时候都会注册一个Observer，用来监视他。
		// 所有Emitter，Baelish，Varys等都被King's Hand 监视。
		emitters.add(new LordBaelish(kingsHand));
		emitters.add(new LordVarys(kingsHand));
		emitters.add(new Scout(kingsHand));

		for (Weekday day : Weekday.values()) {
			System.out.print(day + ": ");
			for (EventEmitter emitter : emitters) {
				emitter.timePasses(day);
			}
			System.out.println("");
		}
	}
}
