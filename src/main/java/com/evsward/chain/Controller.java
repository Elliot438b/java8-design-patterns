package com.evsward.chain;

public class Controller {
	RequestHandler chain;

	public Controller() {
		buildChain();
	}

	private void buildChain() {
		/*
		 * actually, there isn't a fix order to build the chain.
		 */
		chain = new Refrigerator(new AirConditioner(new Television(null)));
	}
	
	public void makeRequest(Request req){
		chain.handleRequest(req);
	}
}
