package com.javastudy.JUNE_2025.Class04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * Create student list with name and age
         * put student "name-age" as string into array
         * as the above form
         */

         ArrayList<Student> list = new ArrayList<>();
         list.add(new Student(12, "TOM"));
         list.add(new Student(14, "SAM"));
         list.add(new Student(15, "LEE"));
         list.add(new Student(16, "VINC"));

         String[] name = list
         .stream()
         .map(new Function<Student, String>(){

            @Override
            public String apply(Student t) {
                return t.getName()+ " - "+t.getAge();
            }})
         .toArray(String[]::new);
         System.out.println(Arrays.toString(name));
        }


        
        
}
