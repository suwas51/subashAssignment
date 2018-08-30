package com.jpa.dao;

import javax.persistence.EntityManager;
import javax.validation.constraints.Email;

import com.imcs.customer.customerJPA.Customer;
import com.jpa.util.JPAUtil;

public class CustomerDAOImpl implements CustomerDAO {
	EntityManager entityManager;

	public Customer loadCustomer(int id) {
		entityManager = JPAUtil.getEntityFactory().createEntityManager();

		return entityManager.find(Customer.class, id);
	}

	public Customer saveCustomer(Customer customer) {
		 entityManager = JPAUtil.getEntityFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		//entityManager.getTransaction().rollback();
		entityManager.getTransaction().commit();
		return null;
	}

	public Customer updateStudent(Customer customer) {
		 entityManager = JPAUtil.getEntityFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	public boolean deleteCustomer(int id) {
		
		 entityManager = JPAUtil.getEntityFactory().createEntityManager();
		 Customer customer = loadCustomer(id);
		entityManager.getTransaction().begin();
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
		
		return true;
	}

}
