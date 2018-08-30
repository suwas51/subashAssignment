package com.imcs.customer.customerApp;

import com.imcs.customer.customerJPA.Customer;
import com.jpa.dao.CustomerDAO;
import com.jpa.dao.CustomerDAOImpl;

public class CustomerApp {

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer customer = new Customer(141, "Suleman", "11/10/1991", 12345.00, "Address line 1", 1212);
		Customer customer1 = new Customer(121, "Malla", "11/10/1990", 86565.00, "Address line 9",2012);
		Customer customer2 = new Customer(111, "Baba", "11/10/1995", 25645.00, "Address line 2",2112);
		Customer customer3 = new Customer(121, "Jay", "11/10/1998", 34565.00, "Address line 4",3112);
		

		//customerDAO.saveCustomer(customer);
		//customerDAO.saveCustomer(customer2);
		//customerDAO.saveCustomer(customer3);
		
				
		System.out.println(customerDAO.saveCustomer(customer));
		System.out.println("Data persisted to the database successfully");
		
		//Delete Customer
		Customer customerDel = customerDAO.loadCustomer(111);
		System.out.println(customerDel);
		
		//Called load methond for customer as ToString
		System.out.println(customerDAO.loadCustomer(101));
		

		//Update Customer 		
		Customer customerUpdate = customerDAO.loadCustomer(141);
		customerUpdate.setName("MAC");
		System.out.println(customerDAO.updateStudent(customerUpdate));
	}

}
