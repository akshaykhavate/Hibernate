package org.hib.app.annot.one2one.Tester;

import org.hib.app.annot.one2one.Bean.Capital;
import org.hib.app.annot.one2one.Bean.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	public static void main(String[] args) {
		Capital cap = new Capital();
		cap.setName("Delhi");

		Country ctr = new Country();
		ctr.setContinent("Asia");
		ctr.setName("India");
		ctr.setCap(cap);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(ctr);
		t.commit();
		session.close();
	}
}
