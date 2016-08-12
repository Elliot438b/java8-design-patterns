package com.evsward.chain;

public abstract class RequestHandler {
	private RequestHandler next;

	public RequestHandler(RequestHandler next) {
		this.next = next;
	}

	public void handleRequest(Request req) {
		if (next != null) {
			next.handleRequest(req);
		}
	}

	protected void printHanding(Request req) {
		System.out.println(this + "handling request \"" + req + "\"");
	}

	@Override
	public abstract String toString();// shows the child's own name.

}
