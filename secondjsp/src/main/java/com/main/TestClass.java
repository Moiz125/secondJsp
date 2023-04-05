package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main( String[] args )
    {
        System.out.println("Connection Started...");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Inserting data into database
//        StudentEntity std = new StudentEntity("Moiz","18sw125");
        StudentEntity std = new StudentEntity(1, "Moiz","18sw125");

        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(std);
            tx.commit();
            System.out.println("Record added successfully!");
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }

        
        //Fetching data from database
//        Student std = (Student)session.load(Student.class, 1);
//		Student std1 = (Student)session.get(Student.class, 1);
//        System.out.print(std.getName()+ " : "+std.getRollno() );
//        System.out.print(std1.getName()+ " : "+std1.getRollno() );
        
//        session.close();

        
    }
}
