package com.javastudy.JUNE_2025.Class04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise1 {
    public static void main(String[] args) {
        /*
         * RQ: Arraylist with following info e.g. "Sam,11"
         *     resave into student array
         */

         ArrayList<String> list =new ArrayList<>();
         Collections.addAll(list, "SAM,11","TOM,14","LEE,9");

        Student[] studentArr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(studentArr));
    }
}
