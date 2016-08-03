package com.evsward.builder;

public enum Generation {
	First, Second, Third, Fourth, Fifth;

	@Override
	public String toString() {
		return name().toLowerCase()+" generation";
	}
	
}
