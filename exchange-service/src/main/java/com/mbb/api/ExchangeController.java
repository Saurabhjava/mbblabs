package com.mbb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mbb.entity.ExchangeBean;
import com.mbb.service.ExchangeService;

@RestController
public class ExchangeController {
	@Autowired
	private ExchangeService service;
	@Autowired
	private Environment env;
	
	@GetMapping("exchangeservice/from/{from}/to/{to}")
	public ExchangeBean getCurrency(@PathVariable String from,@PathVariable String to) {
		ExchangeBean eb=service.getExchangeValue(from, to);
		eb.setPort(Integer.parseInt(env.getProperty("server.port")));
		return eb;
	}
}
