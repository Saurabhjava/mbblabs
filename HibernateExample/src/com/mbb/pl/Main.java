package com.mbb.pl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mbb.collectionmapping.Cart;
import com.mbb.dao.EmployeeDao;
import com.mbb.entity.Employee;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		/*
		 * Transaction tx=session.beginTransaction(); List<String> li=new
		 * ArrayList<String>(); li.add("Laptop"); li.add("Mobile"); li.add("Tab");
		 * 
		 * Cart c=new Cart(); c.setName("flipKart"); c.setProduct(li);
		 * 
		 * session.save(c);
		 * 
		 * tx.commit(); session.close();
		 * 
		 * System.out.println("Cart Done....");
		 */
		
		
		  Cart c=ses.get(Cart.class, 10);		  
		  System.out.println("=======Cart Name: "+c.getName()+"===============");
		  ses.close();
		  c.getProduct().forEach(s->System.out.println(s));
		 
		
	}

}
