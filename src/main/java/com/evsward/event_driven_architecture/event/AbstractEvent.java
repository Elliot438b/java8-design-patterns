package com.evsward.event_driven_architecture.event;

import com.evsward.event_driven_architecture.framework.Event;

public class AbstractEvent implements Event {

	@Override
	public Class<? extends Event> getType() {
		return getClass();
	}

}
