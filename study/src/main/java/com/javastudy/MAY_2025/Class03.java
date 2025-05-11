package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.Collections;

public class Class03 {
    public static void main(String[] args) {
        /*
         * public static <T> boolean addAll (Collection<T> c, T... elements)
         * public static void shuffle(List<?> list)
         */

        // addAll

        // Creat list
        ArrayList<String> list = new ArrayList<>();

        // Add multiple element into the list
        Collections.addAll(list, "abc", "bcd", "aaa","bbb","ccc");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        
    }

}
