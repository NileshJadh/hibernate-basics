package com.vicky.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vicky.model.Student;

public class LaunchFirstApp {

	public static void main(String[] args) {

		// step 01 Configuration object
		
		Configuration config = new Configuration();
		
		// step 2 configure hibernate.cfg.xml. file to configuration object
		
		config.configure();
		
		//step 3 create sessionfactory object
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		// step 4 get the session object from session factory
		
		Session session = sessionFactory.openSession();
		
		// step 5 begin transaction within session
		
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("Nilesh");
		student.setScity("Pune");
		
		// step 6 perform operation
		session.persist(student);
		
		// step 7 performing transaction operations
		transaction.commit();
		
		// step 8 close the resources
		
		session.close();
		
		
		
		
	}

}
