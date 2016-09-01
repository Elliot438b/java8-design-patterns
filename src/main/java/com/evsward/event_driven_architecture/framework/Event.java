package com.evsward.event_driven_architecture.framework;

public interface Event {
	// Returns the message type as a {@link Class} object.
	Class<? extends Event> getType();
}
