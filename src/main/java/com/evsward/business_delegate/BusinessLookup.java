package com.evsward.business_delegate;

public class BusinessLookup {
	private EjbService ejbService;
	private JmsService jmsService;

	public BusinessService getBusinessService(ServiceType serviceType) {
		if (serviceType.equals(ServiceType.EJB)) {
			return ejbService;
		} else {
			return jmsService;
		}
	}

	public void setEjbService(EjbService ejbService) {
		this.ejbService = ejbService;
	}

	public void setJmsService(JmsService jmsService) {
		this.jmsService = jmsService;
	}

}
