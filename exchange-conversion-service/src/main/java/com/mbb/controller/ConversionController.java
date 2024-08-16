package com.mbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mbb.bean.ConversionBean;
import com.mbb.proxy.FeignProxy;

@RestController
public class ConversionController {
	
	@Autowired
	private FeignProxy proxy;
	
	@GetMapping("calculationservice/from/{from}/to/{to}/qty/{qty}")
	public ConversionBean getData
	(@PathVariable String from, @PathVariable String to, @PathVariable int qty) {
		ConversionBean cb=proxy.getExchangeData(from, to);
		cb.setQty(qty);
		cb.setTotalValue(cb.getExchangeValue()*qty);
		return cb;
	}
}
