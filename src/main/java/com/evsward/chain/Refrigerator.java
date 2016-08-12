package com.evsward.chain;

public class Refrigerator extends RequestHandler {

	public Refrigerator(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request req) {
		if (req.getRequestType().equals(RequestType.FreezingFood)) {
			printHanding(req);
			req.markHandled();
		}else{
			super.handleRequest(req);//not my duty, find the next object to do this thing.
		}
	}

	@Override
	public String toString() {
		return "refrigerator";
	}

}
