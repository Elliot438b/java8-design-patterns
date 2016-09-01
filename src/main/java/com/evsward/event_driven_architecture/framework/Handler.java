package com.evsward.event_driven_architecture.framework;

public interface Handler<E extends Event> {
	void onEvent(E event);
}
