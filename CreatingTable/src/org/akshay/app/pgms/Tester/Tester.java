package org.akshay.app.pgms.Tester;

import java.util.ArrayList;
import java.util.List;

import org.akshay.app.pgms.Bean.User;
import org.akshay.app.pgms.Bean.User1;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		/*User1 u1 = new User1();
		u1.setName("Mahi7");
		u1.setAge(36);*/
		
		User u1 = new User();
		u1.setName("Mahi");
		u1.setAge(36);
		
		Configuration cfg = new Configuration();
		cfg.addResource("user.hbm.xml");
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t1= session.getTransaction();
		t1.begin();
		Query query = session.createQuery(" select id,name,age from User where age>25");
		//int a = query.executeUpdate();
		//long a = (long)query.uniqueResult();
		//System.out.println(a);
		List<Object[]> array = (List<Object[]>) query.list();
		for (Object[] obj : array) {
			System.out.println("id :"+obj[0]+" name :"+obj[1]+" age :"
					+ ""+obj[2]);
		}
		session.save(u1);
		t1.commit();
		session.close();
	}
}
