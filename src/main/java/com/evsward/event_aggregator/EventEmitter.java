package com.evsward.event_aggregator;

import java.util.LinkedList;
import java.util.List;

/**
 * event source, emitter: the event is from where in the first time.
 * 
 * @author xp020154
 *
 */
public abstract class EventEmitter {
	private List<EventObserver> observers;

	public EventEmitter() {
		observers = new LinkedList<>();
	}

	/**
	 * 每当创建一个Emitter，就将实例存入Observer计数器中。 Observer 是观察Emitter的
	 * 
	 * @param obs
	 */
	public EventEmitter(EventObserver obs) {
		this();
		registerObserver(obs);
	}

	/**
	 * need register. 观察这需要先注册 也可以手动添加Observer，不走构造方法。
	 * 
	 * @param obs
	 */
	public final void registerObserver(EventObserver obs) {
		observers.add(obs);
	}

	/**
	 * core executed function. 通知所有的Observer，触发事件执行。
	 * 
	 * @param e
	 */
	protected void notifyObservers(Event e) {
		for (EventObserver obs : observers) {
			obs.onEvent(e);
		}
	}

	public abstract void timePasses(Weekday day);
}
