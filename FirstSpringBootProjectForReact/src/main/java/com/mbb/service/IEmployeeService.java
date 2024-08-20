package com.mbb.service;

import java.util.List;

import com.mbb.entity.Employee;
import com.mbb.exception.EmployeeCreationException;

public interface IEmployeeService {
	Employee createEmployee(Employee e) throws EmployeeCreationException;
	Employee findEmployee(int empid);
	String updateEmployee(Employee e);
	List<Employee> getAllEmployee();
	String deleteEmployee(int empid);
	List<Employee> getByName(String name);
}
