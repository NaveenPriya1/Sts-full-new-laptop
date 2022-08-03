package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.EProduct;

public class HibernateUtil {
	
	static SessionFactory sessionfactory;
	
	public static SessionFactory buildSessionFactory() {
		
		sessionfactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EProduct.class).buildSessionFactory();
		
		return sessionfactory;
		
	}

}
