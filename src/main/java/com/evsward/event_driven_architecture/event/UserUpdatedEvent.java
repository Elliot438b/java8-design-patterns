package com.evsward.event_driven_architecture.event;

import com.evsward.event_driven_architecture.model.User;

public class UserUpdatedEvent extends AbstractEvent {
	private User user;

	public UserUpdatedEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
