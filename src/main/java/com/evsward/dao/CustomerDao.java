package com.evsward.dao;

import java.util.Optional;
import java.util.stream.Stream;

public interface CustomerDao {
	// Stream just like a set ,but stream type.
	Stream<Customer> getAll() throws Exception;

	// non-null object type
	Optional<Customer> getById(int id) throws Exception;

	boolean add(Customer customer) throws Exception;

	boolean update(Customer customer) throws Exception;

	boolean delete(Customer customer) throws Exception;
}
