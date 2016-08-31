package com.evsward.event_aggregator;

/**
 * King is also be a event observer. But he just receive the event result from
 * king's hand.
 * 
 * @author xp020154
 *
 */
public class KingJoffrey implements EventObserver {

	@Override
	public void onEvent(Event e) {
		System.out.println("Received event from the King's hand: " + e.toString());
	}

}
