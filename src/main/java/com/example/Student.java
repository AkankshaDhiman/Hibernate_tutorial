package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Hello world!
 *
 */
@Entity
public class Student
{
    private String name;
    @Id
    private int id;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student {" + "id=" +id +
                ",name= " +name +",age " +age +'}';
    }
}
