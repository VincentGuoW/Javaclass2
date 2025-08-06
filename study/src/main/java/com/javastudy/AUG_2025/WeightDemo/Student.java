package com.javastudy.AUG_2025.WeightDemo;

public class Student {
    private String name;
    private String gender;
    private int age;
    private int count;

    public Student() {
    }

    public Student(String name, String gender, int age, int count) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gender=" + gender + ", age=" + age + ", count=" + count + "]";
    }

}
