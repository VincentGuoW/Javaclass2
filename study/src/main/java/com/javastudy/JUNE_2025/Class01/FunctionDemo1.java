package com.javastudy.JUNE_2025.Class01;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {15,21,3,51,7,4,9};

        //Anonymous Inner Class 1
        Arrays.sort(arr,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });
        System.out.println(Arrays.toString(arr));
        
        
        //lambda

        Arrays.sort(arr,(o1,o2)->o1-o2) ;
        System.out.println(Arrays.toString(arr));

        //Use other method

        Arrays.sort(arr, FunctionDemo1::functionMethod);
        System.out.println(Arrays.toString(arr));

    }

   

    public static int functionMethod(Integer number1,Integer number2){
        return number2 - number1;
    }
}
