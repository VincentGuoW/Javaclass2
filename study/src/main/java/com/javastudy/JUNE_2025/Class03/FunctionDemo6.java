package com.javastudy.JUNE_2025.Class03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1","123","234","3");
        
        //list.stream().map(Integer::parseInt).forEach(System.out::println);
        //ArrayType[]::new ！！   
        Integer[] resultArray = list.stream().map(Integer::parseInt).toArray(new IntFunction<Integer[]>() {

            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
            
        });
        System.out.println(resultArray);
       
        System.out.println(Arrays.toString(resultArray));
    }
}
