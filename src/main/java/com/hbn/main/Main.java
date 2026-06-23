package com.hbn.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
      
		Address add1=new Address();
		add1.setCity("GZB");
		add1.setState("UP");
		
		
		Employee e1 = new Employee();
		e1.setName("Ashish");
		e1.setGender("male");
		e1.setSalary(50000);
		e1.setAge(24);
		e1.setAddress(add1);
		
		session.persist(add1);
		session.persist(e1);
		
		
		tx.commit();
			
	}

}
