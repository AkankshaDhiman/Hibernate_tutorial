package com.example;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.setId(sc.nextInt());
        String temp =  sc.nextLine();
        student.setName(sc.nextLine());
        student.setAge(sc.nextInt());

        Configuration config = new Configuration();

        //hibernate setup
        config.addAnnotatedClass(com.example.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Transaction transaction= session.beginTransaction();
        session.persist(student);
        transaction.commit();
        System.out.println(student);
        session.close();
        sessionFactory.close();
    }
}
