package com.evsward.business_delegate;

/**
 * business delegate pattern is goal to loose the coupling from multiple lier.
 * 
 * @author xp020154
 *
 */
public class App {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		BusinessLookup lookupService = new BusinessLookup();
		lookupService.setEjbService(new EjbService());
		lookupService.setJmsService(new JmsService());
		businessDelegate.setLookupService(lookupService);
		/**
		 * you can use just businessDelegate to do the task without the client
		 * lier.
		 */
		businessDelegate.setServiceType(ServiceType.EJB);
		businessDelegate.doTask();
		businessDelegate.setServiceType(ServiceType.JMS);
		businessDelegate.doTask();
		System.out.println();
		/**
		 * There's one lier more named client lier.
		 */
		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType(ServiceType.EJB);
		client.doTask();

		businessDelegate.setServiceType(ServiceType.JMS);
		client.doTask();
	}
}
