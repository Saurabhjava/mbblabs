package com.mbb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbb.entity.Employee;
import com.mbb.exception.EmployeeCreationException;
import com.mbb.exception.EmployeeNotFoundException;
import com.mbb.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@GetMapping(produces = {"application/xml","application/json"})
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}

	@GetMapping("/{eid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int eid) throws EmployeeNotFoundException {
		Employee e = service.findEmployee(eid);
		if (e != null)
			return new ResponseEntity<Employee>(e, HttpStatus.OK);
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}
	@PostMapping
	public Employee addEmployee(@RequestBody @Valid Employee e) throws EmployeeCreationException {
		return service.createEmployee(e);
	}
	/*
	 * @PutMapping public Employee updateEmployee(Employee e) {
	 * 
	 * }
	 * 
	 * @DeleteMapping("/{empid}") public Employee deleteEmployee(@PathVariable int
	 * empid) {
	 * 
	 * }
	 */
}
