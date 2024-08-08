package com.mbb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mbb.entity.Employee;
import com.mbb.util.SessionFactoryCofig;

public class EmployeeDao {
	SessionFactory sf=SessionFactoryCofig.getFactory();
	public String createEmployee(Employee emp) {
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(emp);
		tx.commit();
		ses.close();
		return "Employee Created...";
	}
	public Employee getEmployee(int empid) {
		Session ses=sf.openSession();
		Employee emp=ses.find(Employee.class, empid);
		return emp;
	}
	public String updateEmployee(Employee e) {
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.update(e);
		tx.commit();
		ses.close();
		return "Employee with "+e.getEmpid()+" Updated";
	}
	public String deleteEmployee(int eid) {
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Employee e=getEmployee(eid);
		if(e!=null) {
			ses.delete(e);
			tx.commit();
			ses.close();
			return "Employee Deleted";			
		}
		else
			return "Employee Not Found";
	}
	
	public List<Employee> getAll() {
		Session ses=sf.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e");
		
		List<Employee> li=q.list();
		return li;
	}
	
}
