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

		Employee e1 = new Employee();
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

// ---get all records from company----		
//		Query query=session.createQuery("from Employee",Employee.class);	
//		List list=query.getResultList();
//		System.out.println(list);

		
// ---get records with pagination from company---
//		Query query=session.createQuery("from Employee",Employee.class);
//		query.setFirstResult(2);
//		query.setMaxResults(4);
		
//		List list=query.getResultList();
//		System.out.println(list);
	
//---update query in company----	
//		MutationQuery query=session.createMutationQuery("update Employee set name=:n where id=:i");
//		query.setParameter("n","Udit Narayan");
//		query.setParameter("i", 3);
//		
//		query.executeUpdate();
		
//---delete Query from company----	
//		MutationQuery query=session.createMutationQuery("delete Employee where id=:i");
//		query.setParameter("i","5");
//		query.executeUpdate();
	
//	Aggregation Function	
		
		Query query1=session.createQuery("select min(name) from Employee");
		List list=query1.getResultList();
		System.out.println(list);
		
		tx.commit();
			
	}

}
