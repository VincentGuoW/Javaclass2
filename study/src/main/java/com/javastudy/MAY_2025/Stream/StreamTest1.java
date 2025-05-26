package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        /*
         * Array add number 1,2,3...10
         * Only keep odd number
         */
        System.out.println("--------------------");
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.addAll(another ArrayList is fine, can't be multiple element)
        Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = arr.stream().filter(s -> (s % 2) != 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
