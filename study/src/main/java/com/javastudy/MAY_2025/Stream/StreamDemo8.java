package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo8 {
    public static void main(String[] args) {
        // Collect(Collector collector) collect the data and put in (List Set Map)

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-a-1", "b-a-3", "c-a-4", "a-c-6", "a-d-8", "a-e-9");

        // Rq: only collect the middle one is "a"

        list.stream().filter(s -> "a".equals(s.split("-")[1])).forEach(s -> System.out.println(s));

        list.stream().filter(s -> "a".equals(s.split("-")[1])).collect(Collectors.toList());
        list.stream().filter(s -> "a".equals(s.split("-")[1])).collect(Collectors.toSet());

        //Map the key must be one and only. If they have the same key will cus error
        Map<String, String> resultMap = list.stream().filter(s -> "a".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {

                    @Override
                    public String apply(String t) {
                        return t.split("-")[0];
                    }

                }, new Function<String, String>() {

                    @Override
                    public String apply(String t) {
                        return t.split("-")[2];
                    }

                }));
        
        System.out.println(resultMap);
    }
}
