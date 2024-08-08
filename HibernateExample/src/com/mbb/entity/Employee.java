package com.mbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emptable")
public class Employee {
	@Id
	@Column(name = "employee_id")
	@SequenceGenerator(name="myseq", sequenceName = "emp_seq1", initialValue = 101, allocationSize = 5)
	@GeneratedValue(generator = "myseq")
	private int empid;
	private String name; 
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + "]";
	}	
	
}
