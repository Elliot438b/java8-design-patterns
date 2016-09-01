package com.evsward.event_driven_architecture.handler;

import com.evsward.event_driven_architecture.event.UserCreatedEvent;
import com.evsward.event_driven_architecture.framework.Handler;

public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

	@Override
	public void onEvent(UserCreatedEvent event) {
		System.out.println(String.format("User ’%s' has been Created!", event.getUser().getUsername()));
	}

}
