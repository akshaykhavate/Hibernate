package org.akshay.app.hib.Test;

import java.util.ArrayList;

import org.akshay.app.hib.Bean.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		User u = new User();
		/*u.setName("akshay");
		u.setAge(21);
		u.setName("");*/
		
		System.out.println("##########Execution starts###########");
		Configuration cfg = new Configuration();
		cfg.addResource("user.hbm.xml");
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.getTransaction();
		t.begin();
		//Query query = session.createQuery("update User set name = ?  where id = ? ");
		//Query query = session.createQuery("delete from  User  where id = 2 ");
		//Query query = session.createQuery("select count(*) from User");
		//query.setString(0,"Dingi");
		//query.setInteger(1, 2);
		//int a = query.executeUpdate();
		//long a = (long) query.uniqueResult();
		//System.out.println(a);
		Query query = session.createQuery("select id,name from User where name='Dingi'");
		ArrayList<Object[]> list = (ArrayList<Object[]>) query.list();
		for(Object[] b:list){
			System.out.println("Id: "+b[0]+" Name:"+b[1]);
		}
		//Object[] b=(Object[]) query.uniqueResult();
		//System.out.println("Id: "+b[0]+" Name:"+b[1]);
		//session.save(u);
		t.commit();
		session.close();
	}

}
