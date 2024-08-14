package com.mbb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbb.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByName(String name);
}
