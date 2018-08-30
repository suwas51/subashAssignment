package com.jpa.dao;

import com.imcs.customer.customerJPA.Customer;

public interface CustomerDAO {
	
	public Customer loadCustomer(int id);
	public Customer saveCustomer(Customer customer);
	public Customer updateStudent(Customer customer);
	public boolean deleteCustomer(int id);
}
