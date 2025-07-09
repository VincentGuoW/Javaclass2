package com.javastudy.JULY_2025;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Student2 stu = new Student2("Tom,23");
        System.out.println(stu);

        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
        Index 1 out of bounds for length 1
        at com.javastudy.JULY_2025.Student2.<init>(Student2.java:11)
        at com.javastudy.JULY_2025.ExceptionDemo3.main(ExceptionDemo3.java:5)
         */
    }
}
