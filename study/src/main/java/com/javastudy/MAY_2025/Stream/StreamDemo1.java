package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*
            single list : default Stream<E> stream()
            double list :
            array: public static <T> Stream<T> Stream(T[] array)
            value: public static <T> Stream<T> of(T...values)
         
        */

        //single : default Stream<E> stream()
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","B","C","d","ee");
        //list.stream().forEach(s -> System.out.println(s));
        Stream<String> stream1 = list.stream();
        stream1.forEach((string) -> {
            System.out.println(string);
        });
    
        //double list :
        HashMap<String,String> hm = new HashMap<>();
        hm.put("a", "A");
        hm.put("b", "B");
        hm.put("c", "C");
        hm.put("d", "D");
        
        Set<String> hmKeySet = hm.keySet();
        Stream<String>stream2 = hmKeySet.stream();
        stream2.forEach((string) -> {
            System.out.println(string);
        });

        Set<Map.Entry<String,String>> hmEntrySet= hm.entrySet();
        hmEntrySet.stream().forEach(h -> System.out.println(h));

        
    
    }
}
