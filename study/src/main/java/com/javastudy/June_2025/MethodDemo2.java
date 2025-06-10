package com.javastudy.June_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class MethodDemo2 {
    public static void main(String[] args) {
        //String[] arr = {"1","2","3","4","5"};
        // Use static method change number in array into int
        String[] arr = {"1","2","3","4","5"};

        StringBuilder  arrInt = new StringBuilder();
        for (String intString : arr) {
            arrInt.append(Integer.parseInt(intString));
        }
        
        //Anonymous Inner Class
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1","2","3","4","5");
        list.stream().map(new Function<String, Integer>(){
            @Override
            public Integer apply(String t) {
               return Integer.parseInt(t);
            }

        }).forEach(s->System.out.println(s));


        //Lambda expresssion
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "1","2","3","4","5");
        list.stream().map(s->Integer.parseInt(s)).forEach(s->System.out.println(s));


        //Method Reference
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "1","2","3","4","5");
        list.stream().map(Integer::parseInt).forEach(System.out::println);


       
    }
}
