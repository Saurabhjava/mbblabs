package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		Question q = new Question("What is Java?", "Bibhuti");
		Set<Answer> ans = new HashSet<Answer>();
		ans.add(new Answer("Java is OOP", "X"));
		ans.add(new Answer("Java is PI", "I"));
		ans.add(new Answer("Java is MT", "Z"));
		q.setAnswers(ans);

		ses.save(q);
		tx.commit();
		System.out.println("Data Saved....");

		/*
		 * Question q=ses.get(Question.class, 44);
		 * System.out.println(q.getQuestionName());
		 * System.out.println("======Answer=========");
		 * q.getAnswers().forEach(a->System.out.println(a.getAnswer()));
		 */

	}

}
