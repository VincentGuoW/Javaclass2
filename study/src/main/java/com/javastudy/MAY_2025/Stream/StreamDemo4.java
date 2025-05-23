package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //Steam once been used, it will be gone
        System.out.println("===========");
       
         ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("eb");
        list.add("rd");
        list.add("ae");
        list.add("fq");

        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = stream1.filter(s -> s.startsWith("a"));
        stream2.forEach(s-> System.out.println(s));

        System.out.println("=====================");

        System.out.println(list);

        System.out.println("=====================");
        
        //Error: stream1 been used. It's gone
        //stream1.forEach(s->System.out.println(s));
    }
    
}