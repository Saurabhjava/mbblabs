package hql;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class HqlMain {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();

		/*
		 * Query q = ses.createSQLQuery("select * from employee"); List<Object> li =
		 * q.list(); for (Object obj : li) { Object o[] = (Object[])obj;
		 * System.out.println(o[0] + "\t" + o[1] + "\t" + o[2]); }
		 */

		/*
		 * Query<Object[]> q=ses.createQuery("select e.name, e.salary from Employee e");
		 * 
		 * for(Object o[]:q.list()) { System.out.println(o[0]+"\t"+o[1]); }
		 */

		/*
		 * CriteriaBuilder cb = ses.getCriteriaBuilder(); 
		 * CriteriaQuery<Employee> cq = cb.createQuery(Employee.class); 
		 * Root<Employee> r=cq.from(Employee.class);
		 * cq.where(cb.gt(r.get("salary"), 50000)); 
		 * List<Employee> emps =ses.createQuery(cq).getResultList(); 
		 * emps.forEach(e->System.out.println(e));
		 * }
		 */

		Criteria c = ses.createCriteria(Employee.class);
		c.add(Restrictions.between("salary", 50000.00, 70000.00));
		List<Employee> emps=c.list();
		emps.forEach(e->System.out.println(e));
	}
}
