package com.javastudy.JULY_2025.IOClass.IOClass11;

<<<<<<< HEAD
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -4016602135214900592L;
=======
import java.io.NotSerializableException;
import java.io.Serializable;

public class Student implements Serializable {
    //use implements Serializable!!
>>>>>>> 21b20e1f3ca6b77e4f933d59eeddb0f1a6b9d322
    private int age;
    private String name;
    private String test;

    private transient String password;

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
