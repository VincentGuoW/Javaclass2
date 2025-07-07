package com.javastudy.JULY_2025;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(60);
        /*
         * Exception in thread "main" java.lang.RuntimeException
         * at com.javastudy.JULY_2025.Student.setAge(Student.java:28)
         * at com.javastudy.JULY_2025.ExceptionDemo4.main
         * (ExceptionDemo4.java:6)
         * PS D:\Vincent\JavaClass>
         * 
         */
    }
}
