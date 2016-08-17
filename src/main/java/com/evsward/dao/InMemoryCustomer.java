package com.evsward.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class InMemoryCustomer implements CustomerDao {
	private Map<Integer, Customer> idToCustomer = new HashMap<>();

	@Override
	public Stream<Customer> getAll() throws Exception {
		return idToCustomer.values().stream();
	}

	@Override
	public Optional<Customer> getById(int id) throws Exception {
		return Optional.ofNullable(idToCustomer.get(id));
	}

	@Override
	public boolean add(Customer customer) throws Exception {
		if (getById(customer.getId()).isPresent())
			return false;
		idToCustomer.put(customer.getId(), customer);
		return true;
	}

	@Override
	public boolean update(Customer customer) throws Exception {
		return idToCustomer.replace(customer.getId(), customer) != null;
	}

	@Override
	public boolean delete(Customer customer) throws Exception {
		return idToCustomer.remove(customer.getId()) != null;
	}

}
