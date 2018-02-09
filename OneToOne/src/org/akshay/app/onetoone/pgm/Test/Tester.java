package org.akshay.app.onetoone.pgm.Test;

import org.akshay.app.onetoone.pgm.UserBean.BirthCertificate;
import org.akshay.app.onetoone.pgm.UserBean.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		BirthCertificate bc = new BirthCertificate();
		bc.setDob("01 jan 2018");
		bc.setPlace("Belagavi");
		
		Person p = new Person();
		p.setName("Akshay");
		p.setBc(bc);
		
		bc.setPerson(p);
		
		Configuration cfg = new Configuration();
		//cfg.addResource("person.hbm.xml");
		//cfg.addResource("birthcertificate.hbm.xml");
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction t=session.beginTransaction();
		//t.begin();
		session.save(p);
		t.commit();
		session.close();
	}

}
