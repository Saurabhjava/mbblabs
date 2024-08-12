package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Employee {
	private int empid;
	private String name;
	//@Autowired
	private Address address;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printEmployee() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("=======Address Of Employee==========");
		System.out.println("Employee City:"+address.getCity());
		System.out.println("Employee Country:"+address.getCountry());
		System.out.println("Employee Zip:"+address.getZip());
	}
	
}
