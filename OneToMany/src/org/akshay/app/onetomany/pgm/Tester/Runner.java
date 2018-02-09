package org.akshay.app.onetomany.pgm.Tester;

import java.util.HashSet;

import org.akshay.app.onetomany.pgm.UserBean.Company;
import org.akshay.app.onetomany.pgm.UserBean.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	public static void main(String[] args) {
		Company company = new Company();
		company.setName("SAP");
		company.setLoc("Bengaluru");
		
		Department d1 = new Department();
		d1.setName("R&D");
		d1.setNum(30);
		d1.setCompany(company);

		Department d2 = new Department();
		d2.setName("Development");
		d2.setNum(60);
		d2.setCompany(company);

		Department d3 = new Department();
		d3.setName("Testing");
		d3.setNum(20);

		HashSet<Department> departments = new HashSet<>();
		departments.add(d1);
		departments.add(d2);
		departments.add(d3);

		company.setDepartments(departments);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		t.begin();
		session.save(company);
		t.commit();
		session.close();
	}
}
