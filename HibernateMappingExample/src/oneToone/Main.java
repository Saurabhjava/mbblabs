package oneToone;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		  SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  Session ses=sf.openSession();	  
		  Transaction tx=ses.beginTransaction();
		  
		  DL p=ses.get(DL.class, 10002);
			/*
			 * System.out.println(p.getPerson().getName()); System.out.println(p);
			 */
		  ses.delete(p);
		  tx.commit();
		  System.out.println("Deleted............");
		  
			 	
	}

}
