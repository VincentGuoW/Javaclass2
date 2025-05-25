package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;

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

    }
}
