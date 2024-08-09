package inheritancemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		//ParmanentEmployee e=new ParmanentEmployee();
		Employee c=new Employee();
		c.setName("Saurabh1");
		//c.setPayPerHour(2000);
		ses.save(c);
		tx.commit();
		System.out.println("Employee Saved..");

	}

}
