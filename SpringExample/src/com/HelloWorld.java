package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class HelloWorld {
	@Value("${name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello "+name+"!";
	}
	@PostConstruct
	public void init() {
		System.out.println("Bean Initialized....");
		name="Rahul";
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Destroy....");
	}
}
