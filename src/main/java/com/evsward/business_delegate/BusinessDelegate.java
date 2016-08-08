package com.evsward.business_delegate;

public class BusinessDelegate {
	private BusinessLookup lookupService;
	private BusinessService businessService;
	private ServiceType serviceType;

	public void setLookupService(BusinessLookup lookupService) {
		this.lookupService = lookupService;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}

}
