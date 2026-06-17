package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee( "Vikas", "male", 330000, 40);
		Employee e2=new Employee("Ankit", "male", 400000, 30); 

		
		Session session = HibernateConfig.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		
		session.persist(e1);
		session.persist(e2);
		
		tx.commit();
		
		
		
	}

}
