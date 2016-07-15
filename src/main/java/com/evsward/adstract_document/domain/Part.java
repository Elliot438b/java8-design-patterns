package com.evsward.adstract_document.domain;

import java.util.Map;

import com.evsward.abstract_document.AbstractDocument;

/*
 * There aren't any difference between this and WoodenHouse class.
 * Just this don't have a HasPart but it could be.
 */
public class Part extends AbstractDocument implements HasWoods, HasModel {

	public Part(Map<String, Object> properties) {
		super(properties);
	}

}
