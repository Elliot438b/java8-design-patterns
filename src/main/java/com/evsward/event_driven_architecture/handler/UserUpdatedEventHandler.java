package com.evsward.event_driven_architecture.handler;

import com.evsward.event_driven_architecture.event.UserUpdatedEvent;
import com.evsward.event_driven_architecture.framework.Handler;

public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {

	@Override
	public void onEvent(UserUpdatedEvent event) {
		System.out.println(String.format("User ’%s' has been Updated!", event.getUser().getUsername()));
	}

}
