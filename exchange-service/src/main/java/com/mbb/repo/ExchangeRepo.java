package com.mbb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbb.entity.ExchangeBean;

public interface ExchangeRepo extends JpaRepository<ExchangeBean, Integer> {
	public ExchangeBean findByFromAndTo(String from, String to);

}
