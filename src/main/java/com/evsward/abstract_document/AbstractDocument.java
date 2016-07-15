package com.evsward.abstract_document;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/*
 * define a final constant properties to store the data.
 * implements the children function in detail: find the non-null element and cast them to List<Map<>> construction.
 * return a Stream object transfered by the above data,if null return empty Stream object.
 * override the toString function to satisfy us the output data format.
 */
public abstract class AbstractDocument implements Document {
	private final Map<String, Object> properties;

	public AbstractDocument(Map<String, Object> properties) {
		Objects.requireNonNull(properties, "properties map parameter is required!");
		this.properties = properties;
	}

	public void put(String key, Object value) {
		properties.put(key, value);
	}

	public Object get(String key) {
		return properties.get(key);
	}

	public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
		@SuppressWarnings("unchecked")
		/*
		 * unchecked the source data could transfer to the List<Map<>> construction or not.
		 */
		Optional<List<Map<String, Object>>> any = Stream.of(get(key)).filter(el -> el != null)
				.map(el -> (List<Map<String, Object>>) el).findAny();
		return any.isPresent() ? any.get().stream().map(constructor) : Stream.empty();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName()).append("[");
		properties.entrySet()
				.forEach(e -> builder.append("[").append(e.getKey()).append(" : ").append(e.getValue()).append("]"));
		builder.append("]");
		return builder.toString();
	}

}
