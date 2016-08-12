package com.evsward.chain;

public abstract class RequestHandler {
	private RequestHandler next;

	/**
	 * a loop object constructor.
	 * this is the key constructor of chain pattern.
	 * @param next
	 */
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
	public abstract String toString();// shows the children's own name.

}
