package com.mbb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbb.entity.ExchangeBean;
import com.mbb.repo.ExchangeRepo;

@Service
public class ExchangeService {
	@Autowired
	private ExchangeRepo repo;
	
	public ExchangeBean getExchangeValue(String from, String to) {
		return repo.findByFromAndTo(from, to);
	}
}
