package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Courses;
import com.hibernate.entities.PhoneNumber;
import com.hibernate.entities.Student;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	public static SessionFactory getsessionFactory() {
		
		sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				                         .addAnnotatedClass(Student.class)
				                         .addAnnotatedClass(PhoneNumber.class)
				                         .addAnnotatedClass(Courses.class)
				                         .buildSessionFactory();
		return sessionFactory;
		
		
	}

}
