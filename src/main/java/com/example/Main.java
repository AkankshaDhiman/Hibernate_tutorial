package com.example;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(20);
        student.setName("Joe");
        student.setAge(20);

        //save(student)
        Configuration config = new Configuration().configure();
        SessionFactory sessionfactory=config.buildSessionFactory();
        Session session=sessionfactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(student);
    }
}
