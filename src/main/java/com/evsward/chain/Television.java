package com.evsward.chain;

public class Television extends RequestHandler {

	public Television(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request req) {
		if (req.getRequestType().equals(RequestType.PlayingShows)) {
			printHanding(req);
			req.markHandled();
		} else {
			super.handleRequest(req);// not my duty, find the next object to do
										// this thing.
		}
	}

	@Override
	public String toString() {
		return "television";
	}
}
