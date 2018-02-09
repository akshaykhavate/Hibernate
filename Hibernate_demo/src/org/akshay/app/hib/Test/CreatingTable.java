package org.akshay.app.hib.Test;

import org.hibernate.cfg.Configuration;

public class CreatingTable {
	public static void main(String[] args) {
		User1 u1 = new User1();
		u1.setName("Raju");
		u1.setAge(29);
		
		Configuration cfg = new Configuration();
		//cfg.addResource();
	}
}
