package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StreamDemo3 {
    public static void main(String[] args) {
        //Functional interface has one and only abstract method !
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("eb");
        list.add("rd");
        list.add("ae");
        list.add("fq");

        list.stream().filter(new Predicate<String>() {

            @Override
            public boolean test(String t) {
                return t.startsWith("a");
            }
            
        }).forEach(s->System.out.println(s));;
    }
}
