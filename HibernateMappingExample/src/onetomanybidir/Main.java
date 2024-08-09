package onetomanybidir;

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

		/*
		 * Question q = new Question("What is Hibernate?", "Bhuwan"); Set<Answer> ans =
		 * new HashSet<Answer>(); ans.add(new Answer("Hibernate is ORM framework",
		 * "X",q)); ans.add(new Answer("It is PL", "I",q)); ans.add(new
		 * Answer("It is based on POJO", "Z",q)); q.setAnswers(ans);
		 * 
		 * ses.save(q); tx.commit(); System.out.println("Data Saved....");
		 */

		
		 // Question q=ses.get(Question.class, 56);
		Answer a=ses.get(Answer.class, 54);
		System.out.println(a.getQuestion().getQuestionName());
		 
		 

	}

}
