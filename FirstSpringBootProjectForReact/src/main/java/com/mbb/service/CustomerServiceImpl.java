package com.mbb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbb.entity.Customer;
import com.mbb.repo.ICustomerRepo;

@Service
public class CustomerServiceImpl {
	@Autowired
	private ICustomerRepo cRepo;
	
	public String createCustomer(Customer cust) {
		cRepo.saveCustomer(cust);
		return "Created.......";
	}
	
	/*
	 * public Customer getCustomer(int cid) { Optional<Customer>
	 * op=cRepo.findById(cid); if(op.isPresent()) return op.get(); else return null;
	 * }
	 */
	
}
