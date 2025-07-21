package com.javastudy.JULY_2025.IOClass.IOClass12;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 2233658971839118397L;

    private int age;
    private String name;
    private transient String currentMood;

    public Student() {
    }

    public Student(int age, String name, String currentMood) {
        this.age = age;
        this.name = name;
        this.currentMood = currentMood;
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

    public String getCurrentMood() {
        return currentMood;
    }

    public void setCurrentMood(String currentMood) {
        this.currentMood = currentMood;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append(", currentMood=").append(currentMood);
        sb.append('}');
        return sb.toString();
    }
}
