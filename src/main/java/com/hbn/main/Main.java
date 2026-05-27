package com.hbn.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee(1,"vikas","male",300000,32);
		Employee e2=new Employee(2,"Anuj","male",400000,30);

		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(e1);
		session.persist(e2);
		
		tx.commit();
	}

}
