package com.jsp.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;


public class EmDemo {

		public static void main(String[] args) {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Student student1 = new Student();
			student1.setId(2);
			student1.setCity("Delhi");
			student1.setName("abcd");
			
			Certificate certi = new Certificate();
			certi.setCourse("Android");
			certi.setDuration("3 months");
			
			student1.setCerti(certi);
			
			//to save the object we open the session:
			Session s = factory.openSession();
			Transaction tx = s.beginTransaction();
			//objects save
			s.save(student1);
			tx.commit();
			
			
	}
	
}
