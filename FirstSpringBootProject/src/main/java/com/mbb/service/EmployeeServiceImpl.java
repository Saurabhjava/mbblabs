package com.mbb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbb.entity.Employee;
import com.mbb.exception.EmployeeCreationException;
import com.mbb.exception.EmployeeNotFoundException;
import com.mbb.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Employee createEmployee(Employee e) throws EmployeeCreationException {
		if(findEmployee(e.getEmpid())==null)
			return repo.saveAndFlush(e);
		else
			throw new EmployeeCreationException("Employee Not Created.Because Employee already available");
	}

	@Override
	public Employee findEmployee(int empid) {
		Optional<Employee> op = repo.findById(empid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	@Override
	public String updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}

	@Override
	public String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByName(String name) {
		
		return repo.findByName(name);
	}

}
