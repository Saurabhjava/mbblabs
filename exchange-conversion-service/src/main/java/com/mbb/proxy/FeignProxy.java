package com.mbb.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mbb.bean.ConversionBean;

@FeignClient(name = "exchange-service")
public interface FeignProxy {
	@GetMapping
	("exchangeservice/from/{from}/to/{to}")
	public ConversionBean 
	getExchangeData(@PathVariable String from, @PathVariable String to);
}
