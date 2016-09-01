package com.evsward.event_driven_architecture;

import com.evsward.event_driven_architecture.event.UserCreatedEvent;
import com.evsward.event_driven_architecture.event.UserUpdatedEvent;
import com.evsward.event_driven_architecture.framework.EventDispatcher;
import com.evsward.event_driven_architecture.handler.UserCreatedEventHandler;
import com.evsward.event_driven_architecture.handler.UserUpdatedEventHandler;
import com.evsward.event_driven_architecture.model.User;

/**
 * 事件驱动结构
 * 
 * @author xp020154
 *
 */
public class App {
	public static void main(String[] args) {
		EventDispatcher dispatcher = new EventDispatcher();
		dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
		dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());

		User user = new User("Edward");
		dispatcher.dispatcher(new UserCreatedEvent(user));
		dispatcher.dispatcher(new UserUpdatedEvent(user));
	}
}
