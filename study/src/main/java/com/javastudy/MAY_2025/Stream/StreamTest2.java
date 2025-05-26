package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        /*
         * ArrayList with "name,age"
         * only keep age above 24 into Map ==> key = name ; value = age
         */

         ArrayList<String> arr = new ArrayList<>();
         Collections.addAll(arr, "Tom,23","Henry,25","Lee,26","Gullf,21");

        Map<String,Integer> result =  arr.stream()
            .filter(s->Integer.parseInt(s.split(",")[1])>24)
            .collect(Collectors
                .toMap(s-> s.split(",")[0], 
                       s-> Integer.parseInt(s.split(",")[1])));

        System.out.println(result);
    }
}
