package org.hib.inhe.pgm.Tester;
	
import org.hib.inhe.pgm.Bean.Bike;
import org.hib.inhe.pgm.Bean.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {
		/*Car c = new Car();
		c.setId(1);
		c.setModel("BMW");
		c.setColor("White");
		c.setMusic_system(true);
		c.setAc(true);*/
		
		Bike b =new Bike();
		b.setModel("Bullet");
		b.setColor("Black");
		b.setKicker(false);
		b.setAlloy(true);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(b);
		t.commit();
		session.close();
	}
}
