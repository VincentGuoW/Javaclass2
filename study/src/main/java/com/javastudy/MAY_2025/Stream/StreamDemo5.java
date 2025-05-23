package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;

public class StreamDemo5 {
    public static void main(String[] args) {
        System.out.println("===========");
       
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

        //First x elements E.g.3==> aa eb rd
        list.stream().limit(3).forEach(s->System.out.println(s)); //aa eb rd
    
        //Sikp x element E.g. 3==> skip the first 3 start with 4
        list.stream().skip(3).forEach(s->System.out.println(s));//ae fq

        //if I only want "ae" use limit and skip
        System.out.println("------");
        list.stream().skip(3).limit(1).forEach(s->System.out.println(s));
    
    
        System.out.println("-=-----------------");
        System.out.println(list);
        list.stream().distinct().forEach(s->System.out.println(s));

        System.out.println("-=-----------------");



        
    }
}
