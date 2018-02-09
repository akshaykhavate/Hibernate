package org.hib.app.pgm.one2many.Tester;

import java.util.HashSet;

import org.hib.app.pgm.one2many.Bean.Key;
import org.hib.app.pgm.one2many.Bean.KeyBoard;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	public static void main(String[] args) {
		KeyBoard keyboard = new KeyBoard();
		keyboard.setBrand("apple_mac_book");
		keyboard.setNoofkeys(107);
		
		Key k1 = new Key();
		k1.setKeyType("function_key");
		k1.setVisibility("Backlight");
		
		Key k2 = new Key();
		k2.setKeyType("Special_key");
		k2.setVisibility("Backlight");
		
		Key k3 = new Key();
		k3.setKeyType("Numeric_key");
		k3.setVisibility("Backlight");
		
		HashSet<Key> keys = new HashSet<Key>();
		keys.add(k1);
		keys.add(k2);
		keys.add(k3);
		keyboard.setKeys(keys);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(keyboard);
		t.commit();
		session.close();
	}
}