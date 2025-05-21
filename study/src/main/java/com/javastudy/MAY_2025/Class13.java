package com.javastudy.MAY_2025;

import java.util.ArrayList;

public class Class13 {
    public static void main(String[] args) {
        /*
        Stream method
         */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("a");
        list1.add("bbb");
        list1.add("cabba");
        list1.add("acdfae");
        list1.add("aje");
        list1.add("acdfae");
        list1.stream().filter(name->name.startsWith("a")).filter(name->name.length()==3).forEach(name->System.out.println(name));
    }
}
