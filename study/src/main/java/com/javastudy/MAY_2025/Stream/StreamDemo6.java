package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "aa","b","d","e","fa","u");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "aa","ba","da","ea","fa","ua");

        
        Stream.concat(list1.stream(), list2.stream()).forEach(s->System.out.println(s));
        
        //Map change stream type E.g. String to Integer
        //Map: new Function<Old,New> 
        //<R> The element type of the new stream
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "aa-1","ba-2","da-3","ea-4","fa-5","ua-6");
        list3.stream().map(new Function<String,Integer>() {

            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];// aa-1 split on "-"==> arr[0] ="aa"  arr[1] = "1"
                Integer age = Integer.parseInt(ageString);
                return age;
            }
            
        }).forEach(s->System.out.println(s));
        ;
        System.out.println("-------------------------------s");
        list3.stream()
            .map(s->Integer.parseInt(s.split("-")[1]))
            .forEach(s->System.out.println(s));;

        long countLong = list3.stream().count();
        System.out.println(countLong);

        System.out.println("-------------------------------s");

        //toArray ==> Create an array in order
        String[] arrList = list3.stream().toArray(new IntFunction<String[]>() {

            @Override
            public String[] apply(int value) {
                return new String[value];     
            }
            
        });
        System.out.println(Arrays.toString(arrList));
    }
}
