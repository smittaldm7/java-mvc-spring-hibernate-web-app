package com.springmvc.dao;

import com.springmvc.model.Customer;

public interface CustomerDaoInterface {
	public void create(Customer customer);
	public Customer findByCustomerId(int custId);
}
