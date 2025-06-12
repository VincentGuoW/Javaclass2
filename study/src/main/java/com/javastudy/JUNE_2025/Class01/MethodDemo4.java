package com.javastudy.JUNE_2025.Class01;

import java.util.ArrayList;
import java.util.Collections;

public class MethodDemo4 {
    public static void main(String[] args) {
        new MethodDemo4().run();

    }

    

    public void run (){
        ArrayList<String> nameList5 = new ArrayList<>();
        Collections.addAll(nameList5, "Sam", "Tom", "Henry", "Tommy", "Toby");

        nameList5.stream()
                 .filter(this::test4) 
                 .forEach(System.out::println);
    }

    public  boolean test4(String s) {
        return s.startsWith("T") && s.length() == 3;
    }

}
