package org.akshay.app.manytomany.Tester;

import java.util.HashSet;

import org.akshay.app.manytomany.dto.Bus;
import org.akshay.app.manytomany.dto.Passenger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.setName("Vajra");
		b1.setRoute("Mejestic");

		Bus b2 = new Bus();
		b2.setName("Garden city");
		b2.setRoute("Belagavi");

		Passenger p1 = new Passenger();
		p1.setName("Akshay");
		p1.setDob("30/08/1995");

		Passenger p2 = new Passenger();
		p2.setName("Salman");
		p2.setDob("30/08/1975");

		HashSet<Bus> buses = new HashSet<Bus>();
		buses.add(b1);
		buses.add(b2);
		p1.setBuses(buses);
		p2.setBuses(buses);

		HashSet<Passenger> passengers = new HashSet<Passenger>();
		passengers.add(p1);
		passengers.add(p2);
		b1.setPassengers(passengers);
		b2.setPassengers(passengers);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(b1);
		t.commit();
		session.close();
	}
}
