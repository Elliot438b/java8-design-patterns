package com.evsward.event_driven_architecture.event;

import com.evsward.event_driven_architecture.model.User;

public class UserCreatedEvent extends AbstractEvent {
	private User user;

	public UserCreatedEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
