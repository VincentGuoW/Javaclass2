package com.javastudy.JUNE_2025.Class05;

import com.javastudy.JUNE_2025.Class04.Student;

public class ErrorAndException2 {
     public static void main(String[] args) {
      /*
       * Exception 1:  check where is the bug
       * Exception 2:  as a retrun, check the condition
       * 
       */
        Student  stu = new Student("NAME,123");
        System.out.println(stu);
        
        //ctrl + click for exception line;
     }
}
