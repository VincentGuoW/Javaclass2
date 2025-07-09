package com.javastudy.JULY_2025;

public class Student2 {
    private  String name;
    private  int age;
    public Student2() {
    }
    public Student2(String input) {
        String[]arr = input.split("-");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}
