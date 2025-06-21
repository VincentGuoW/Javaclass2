package com.javastudy.JUNE_2025.Class03;

import java.util.ArrayList;
import java.util.Collections;



public class SteamReview {
    public static void main(String[] args) {
        //Use method 
        //super::method1;
        //this::method1;
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "TOM", "HENRY", "TONNY", "TOBY", "SAM", "LEE");
        list.stream()
                .filter(s -> s.startsWith("T"))
                .filter(s -> s.length() >= 3)
                .forEach(s -> System.out.println(s));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "TOM", "HENRY", "TONNY", "TOBY", "SAM", "LEE");
        
        list2.stream()
                .filter(new SteamReview()::stringMethod)

                //.filter(this::stringMethod) static method can't use this
                .forEach(s -> System.out.println(s));

    }
    public boolean stringMethod(String s){
        
        return  s.length()>=3 && s.startsWith("T");
    }
}
