package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

public class StreamDemo7 {
    public static void main(String[] args) {
        //Important!!
        //Steam().xxx() if return stream keep using other method
        //if return something else, will be final method of steam!!!
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("eb");
        list.add("rd");
        list.add("ae");
        list.add("fq");
        list.add("fq");
        list.add("fq");
        list.add("fq");
        list.add("fq");

        list.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s));

        list.stream().forEach(s->System.out.println(s));

        long listLong = list.stream().count();
        System.out.println(listLong);

        System.out.println("--------------------------------------");
        Object[] listArr = list.stream().toArray();
        System.out.println(Arrays.toString(listArr));

        System.out.println("--------------------------------------");
        String result2 = Arrays.toString(list.stream().toArray(new IntFunction<String[]>() {

            @Override
            public String[] apply(int value) {
               return new String[value];  
            }
            
        }));

        System.out.println(result2);

        System.out.println("--------------------------------------");
        String result3 = Arrays.
            toString(list.stream().
                toArray(value -> new String[value] )
            );

        System.out.println(result3);

}}
