package com.evsward.adstract_document.domain;

import java.util.Optional;

import com.evsward.abstract_document.Document;

public interface HasWoods extends Document {
	String PROPERTY = "woods";

	default Optional<Number> getWoods() {
		return Optional.ofNullable((Number) get(PROPERTY));
	}
}
