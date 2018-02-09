package org.akshay.app.annot.Tester;

import org.akshay.app.annot.Bean.BirthCetificate;
import org.akshay.app.annot.Bean.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	public static void main(String[] args) {
		BirthCetificate bc = new BirthCetificate();
		bc.setPlace("Bengaluru");
		bc.setDob("30/08/1995");

		Person p = new Person();
		p.setName("Akshaykk");
		p.setBc(bc);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(p);
		t.commit();
		session.close();
	}
}
