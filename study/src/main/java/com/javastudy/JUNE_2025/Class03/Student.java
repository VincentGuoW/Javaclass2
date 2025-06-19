package com.javastudy.JUNE_2025.Class03;

public class Student {
    private String name;
    private  int age;
    public Student() {
    }

    public Student(String studentInfo){
        this.name=studentInfo.split(",")[0];
        this.age = Integer.parseInt(studentInfo.split(",")[1]);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
    
}
