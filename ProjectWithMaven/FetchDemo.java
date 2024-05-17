package com.jsp.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	public static void main(String[] args) {
		//get,load
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		//get-Student:1
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		
		
		session.close();
		
	}
	
}
