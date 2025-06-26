package com.example;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.setId(20);
        student.setName("Joe");
        student.setAge(20);

        Configuration config = new Configuration();

        //hibernate setup
        config.addAnnotatedClass(com.example.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Transaction transaction= session.beginTransaction();

        //insertion of data in DB
//        session.persist(student);
//        transaction.commit();
//        System.out.println(student);

        //read class
        Student s1= session.find(com.example.Student.class, student.getId());
        session.remove(s1);
        transaction.commit();
        System.out.println(s1.toString());
        session.close();
        sessionFactory.close();
    }
}
