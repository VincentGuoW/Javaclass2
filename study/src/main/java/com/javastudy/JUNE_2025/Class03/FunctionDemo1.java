package com.javastudy.JUNE_2025.Class03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","d","c","e");

        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        //the two above all work. Since they are all using toUpperCase();
        //It's called "Method Reference Adaptation"
        
        list.stream().map(new Function<String, String>(){

            @Override
            public String apply(String t) {
                return t.toUpperCase();
            }
            
            
        }).forEach(System.out::println);

        //1.String:toUpperCase  &  
        //@Override public String apply(String t)
    }
}
