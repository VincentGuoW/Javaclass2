package com.javastudy.JUNE_2025.Class03;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1","2","3","4");
        //ClassName::methodName
        list.stream().map(s->Integer.valueOf(s)).forEach(System.out::println);
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        list.stream().map(Integer::valueOf).forEach(System.out::println);

        //For above case.
        //input = String & output = Integer
        //So ==> s -> Integer.valueOf(s) this will work
    }
}
