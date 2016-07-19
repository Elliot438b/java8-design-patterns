package com.evsward.abstract_document.domain;

import java.util.Map;

import com.evsward.abstract_document.AbstractDocument;
/*
 * define what you need，if you need, implements it.
 */
public class WoodenHouse extends AbstractDocument implements HasWoods, HasModel, HasParts {

	public WoodenHouse(Map<String, Object> properties) {
		super(properties);
	}

}
