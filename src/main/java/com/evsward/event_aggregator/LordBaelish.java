package com.evsward.event_aggregator;

/**
 * 每个Emitter在创建的时候都会注册一个Observer，用来监视他。
 * 所有Emitter，Baelish，Varys等都被King's Hand 监视。
 * @author xp020154
 *
 */
public class LordBaelish extends EventEmitter {

	public LordBaelish() {
		super();
	}

	public LordBaelish(EventObserver obs) {
		super(obs);
	}

	@Override
	public void timePasses(Weekday day) {
		if (day.equals(Weekday.FRIDAY)) {
			notifyObservers(Event.STARK_SIGHTED);
		}
	}

}
