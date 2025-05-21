package com.javastudy.MAY_2025.Stream;

import java.util.Arrays;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*
            single list : default Stream<E> stream()
            double list :
            array: public static <T> Stream<T> Stream(T[] array)
            value: public static <T> Stream<T> of(T...values)
         
        */

        //array: public static <T> Stream<T> Stream(T[] array)
        String[] test ={"a","b","c","d","e","f"} ;
        Arrays.stream(test).forEach(arr -> System.out.println(arr));

        int[] arr2 = {1,2,3,4,5};
        Arrays.stream(arr2).forEach(arr2 -> System.out.println(arr2));
    }
}
