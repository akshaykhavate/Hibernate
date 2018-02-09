package org.akshay.app.pgm.onetoone.Tester;

import org.akshay.app.pgm.onetoone.UserBean.PAN;
import org.akshay.app.pgm.onetoone.UserBean.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {
		PAN pa =new PAN();
		pa.setDob("1 1 2018");
		pa.setPlace("Bengaluru");
		
		Person p = new Person();
		p.setName("Akshay");
		p.setPan(pa);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		t.begin();
		session.save(p);
		t.commit();
		session.close();
	}

}
