package com.evsward.adstract_document.domain;

import java.util.stream.Stream;

import com.evsward.adstract_document.Document;

public interface HasParts extends Document {
	String PROPERTY = "parts";

	/*
	 * Stream just like a list container but which has a huge ability, lots of
	 * functions. pass a key "parts" and a Part class's constructor function to
	 * invoke the children function in the parent class:Document.
	 */
	default Stream<Part> getParts() {
		return children(PROPERTY, Part::new);
	}
}
