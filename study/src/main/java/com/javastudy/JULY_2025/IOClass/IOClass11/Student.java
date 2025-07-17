package com.javastudy.JULY_2025.IOClass.IOClass11;

import java.io.NotSerializableException;

public class Student extends NotSerializableException {
    private int age;
    private String name;
    public Student() {
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}
