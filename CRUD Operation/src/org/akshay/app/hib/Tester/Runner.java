package org.akshay.app.hib.Tester;

import org.akshay.app.hib.bean.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;

public class Runner {
	public static void main(String[] args) {
		//User user = new User();
		/*user.setName("Dhanush");
		user.setAge(27);
		user.setId(3); //  for delete
	*/	
		
		
		Configuration cfg = new Configuration();
		cfg.addResource("user.hbm.xml");
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.getTransaction();
		t.begin();
		//session.delete(user); for delete
		//User user = (User) session.get(User.class, 5); //get operation
		//System.out.println("Just loaded");
		//System.out.println(user);
		//user.setId(3);
		//user.setName("Akshaykk");
		//user.setAge(21);
		User user = (User) session.load(User.class, 1); //load operaton
		System.out.println(user.getName()+user);// comman for both get() and Load()
		session.update(user);
		t.commit();
		session.close();
	}
}

