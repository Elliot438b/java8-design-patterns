package com.evsward.event_aggregator;

/**
 * 众多事件观察者都要继承该接口。
 * @author xp020154
 *
 */
public interface EventObserver {
	void onEvent(Event e);
}
