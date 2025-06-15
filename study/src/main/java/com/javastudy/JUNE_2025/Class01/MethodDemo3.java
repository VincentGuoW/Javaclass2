package com.javastudy.JUNE_2025.Class01;

import java.util.ArrayList;
import java.util.Collections;

public class MethodDemo3 {
    public static void main(String[] args) {
        /*
         * 1. otherClass::method
         * 2. this::method
         * 3. super::method
         */

        // 1. Arraylist with following: "Sam", "Tom", "Henry","Tommy","Toby"
        // 2. Only keep name start with "T" & lengh <=3;//test 

        ArrayList<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Sam", "Tom", "Henry", "Tommy", "Toby");

        nameList.stream()
                .filter(s -> s.startsWith("T"))
                .filter(s -> s.length() <= 3)
                .forEach(System.out::println);

        ArrayList<String> nameList2 = new ArrayList<>();
        Collections.addAll(nameList2, "Sam", "Tom", "Henry", "Tommy", "Toby");
        nameList2.stream().filter(StringOperation::test).forEach(System.out::println);
    
        ArrayList<String> nameList3 = new ArrayList<>();
        Collections.addAll(nameList3, "Sam", "Tom", "Henry", "Tommy", "Toby");
        nameList3.stream().filter(new MethodDemo3()::test2).forEach(System.out::println);
    

        ArrayList<String> nameList4 = new ArrayList<>();
        Collections.addAll(nameList4, "Sam", "Tom", "Henry", "Tommy", "Toby");
        nameList4.stream().filter(MethodDemo3::test3).forEach(System.out::println);
    
        
    }


    public   boolean test2(String s ){
        return s.startsWith("T") && s.length()==3;
    }

    public static   boolean test3(String s ){
        return s.startsWith("T") && s.length()==3;
    }

    public static  boolean test4(String s ){
        return s.startsWith("T") && s.length()==3;
    }
}
