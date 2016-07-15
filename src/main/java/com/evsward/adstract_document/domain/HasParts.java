package com.evsward.adstract_document.domain;

import java.util.stream.Stream;

import com.evsward.abstract_document.Document;

public interface HasParts extends Document {
	String PROPERTY = "parts";

	/*
	 * the new Stream API for processing collections and managing parallel processing.
	 * Stream is not a data construction or a collection element but a tool about algorithm and calculation just like a iterator.
	 * 
	 * Stream's a 【collection】 container but which has a huge ability, lots of
	 * functions. pass a key "parts" and a Part class's constructor function to
	 * invoke the children function in the parent class:Document.
	 */
	default Stream<Part> getParts() {
		return children(PROPERTY, Part::new);
	}
}
