package com.evsward.abstract_document.domain;

import java.util.Optional;

import com.evsward.abstract_document.Document;
/*
 * one interface. represents like a feature.
 * It has a key named PROPERTY.
 */
public interface HasModel extends Document {
	String PROPERTY = "model";

	/*
	 * Optional lives for dealing a null object.It could avoid to the nullException.
	 */
	default Optional<String> getModel() {
		return Optional.ofNullable((String) get(PROPERTY));
	}
}
