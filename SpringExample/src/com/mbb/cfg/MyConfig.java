package com.mbb.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.Address;
import com.Employee;

@Configuration
@ComponentScan("com")
@PropertySource("classpath:data.properties")
public class MyConfig {
	@Bean("employee")
	public Employee getEmployee() {
		Employee e=new Employee();
		e.setEmpid(1001);
		e.setName("Ankur");
		e.setAddress(getAddress());
		return e;
	}
	@Bean("address")
	public Address getAddress() {
		Address add=new Address();
		add.setCity("BLR");
		add.setCountry("India");
		add.setZip(767899999);
		return add;
	}
}
