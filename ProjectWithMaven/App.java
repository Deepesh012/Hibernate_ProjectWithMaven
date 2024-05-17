package com.jsp.ProjectWithMaven;

import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{	//main class
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("Project Started");
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.isClosed());
        
        Student st = new Student();
        st.setId(1);
        st.setName("Deep");
        st.setCity("Agra");
        System.out.println(st);
        
       Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
       
        
        
        Address ad = new Address();
        ad.setStreet("Street1");
        ad.setCity("Agra");
        ad.setOpen(true);
        ad.setAddedDate(new Date(01-04-2024));
        ad.setX(125.254);
        FileInputStream fis = new FileInputStream("C:\\Users\\Deepesh Kumar\\Documents\\1x1_#093D86FF.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        System.out.println(ad);
        session.save(ad);
        Transaction tx1 = session.beginTransaction();
        tx1.commit();
        
        session.close();
    }
}
