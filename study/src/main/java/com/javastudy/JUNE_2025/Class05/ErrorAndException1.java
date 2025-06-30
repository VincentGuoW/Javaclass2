package com.javastudy.JUNE_2025.Class05;

import com.javastudy.JUNE_2025.Class04.Student;

public class ErrorAndException1 {
     public static void main(String[] args) {
      /*
       * Exception 1:  check where is the bug
       * Exception 2:  as a retrun, check the condition
       * 
       */
        Student[]  arr = new Student[3]; // [null,null,null]
        String name = arr[0].getName(); // arr[0] = null  ==> Null Pointer Exception
        System.out.println(name);
        
        //ctrl + click for exception line
     }
}
