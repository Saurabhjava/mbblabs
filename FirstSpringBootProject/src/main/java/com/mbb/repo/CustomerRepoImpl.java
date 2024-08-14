package com.mbb.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mbb.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepoImpl implements ICustomerRepo {
	@Autowired
	private EntityManager em;
	@Override
	public String saveCustomer(Customer cust) {
		em.persist(cust);
		return null;
	}

}
