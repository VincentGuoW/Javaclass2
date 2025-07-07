package com.javastudy.JULY_2025;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        String name = arr[0].getName();
        System.out.println(name);
        /*
        Exception in thread "main" java.lang.NullPointerException: 
            Cannot invoke "com.javastudy.JULY_2025.Student.getName()" 
            because "arr[0]" is null
        at com.javastudy.JULY_2025.ExceptionDemo2.main(ExceptionDemo2.java:6)
         */
    }
}
