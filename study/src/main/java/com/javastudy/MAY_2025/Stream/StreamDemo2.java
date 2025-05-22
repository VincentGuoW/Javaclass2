package com.javastudy.MAY_2025.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

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

        Integer[] test2 = {1,2,3,4,5};
        Arrays.stream(test2).forEach(arr2 -> System.out.println(arr2));



        //public static <T> Stream<T> of(T...values)
        Stream.of(5,3,2,1,4).forEach(s->System.out.println(s));
    }
}
