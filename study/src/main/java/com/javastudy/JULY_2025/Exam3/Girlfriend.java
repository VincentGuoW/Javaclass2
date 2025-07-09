package com.javastudy.JULY_2025.Exam3;

public class Girlfriend {
    private String name;
    private int age;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>10||name.length()<3) {
            throw new NameLengthException("The name is wrong range length");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>40 || age <18){
            throw new AgeRangeException("Age not in range");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girlfriend [name=" + name + ", age=" + age + "]";
    }

}


