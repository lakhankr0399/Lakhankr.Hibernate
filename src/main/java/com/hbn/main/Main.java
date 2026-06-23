package com.hbn.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Employee e1 = new Employee();
		
	      
        Query query1=session.createNamedQuery("findById",Employee.class);
		query1.setParameter("id",2);
		List list1=query1.getResultList();		
		System.out.println(list1);
		
		System.out.println("------------------");
		
		Query query2=session.createNamedQuery("findByGender", Employee.class);
		query2.setParameter("gender","female");
		List list2=query2.getResultList();
		System.out.println(list2);
		
		
		tx.commit();
		session.close();
			
	}

}
