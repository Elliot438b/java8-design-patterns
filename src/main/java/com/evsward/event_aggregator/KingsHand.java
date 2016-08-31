package com.evsward.event_aggregator;

/**
 * King's hand is not only an event observer, but also an event emitter.
 * Observer is enjoy the msg. Emitter is collect the msg.
 * 
 * @author xp020154
 *
 */
public class KingsHand extends EventEmitter implements EventObserver {
	public KingsHand() {
		super();
	}

	public KingsHand(EventObserver obs) {
		super(obs);
	}

	/**
	 * 触发观察的具体方法
	 */
	@Override
	public void onEvent(Event e) {
		notifyObservers(e);
	}

	@Override
	public void timePasses(Weekday day) {
		if (day.equals(Weekday.MONDAY)) {
			notifyObservers(Event.KINGS_HAND);
		}
	}

}
