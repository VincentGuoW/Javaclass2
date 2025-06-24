package com.javastudy.JUNE_2025.Class04;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        /*
         * Create student list with name and age
         * put student name into array
         * 
         */

         ArrayList<Student> list = new ArrayList<>();
         list.add(new Student(12, "TOM"));
         list.add(new Student(14, "SAM"));
         list.add(new Student(15, "LEE"));
         list.add(new Student(16, "VINC"));

         String[] name = list.stream().map(Student::getName).toArray(String[]::new);
         System.out.println(Arrays.toString(name));
        }
}
