package com.javastudy.MAY_2025;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class11 {
    public static void main(String[] args) {
        //List Immutable demo:
        List<String> list = List.of("a","b","c");
        //unmodifiable list

        //Map Immutable demo:
        Map<String,String> map = Map.of("a","a","b","b");
        //unmodifiable map

        //entries get key+ value ==> If need key + value
        Set<Map.Entry<String,String>> entries =map.entrySet();
        for (java.util.Map.Entry<String,String> e : entries) {
            System.out.println(e.getKey() + " ==> " + e.getValue());
        }

        //keyset get key only. ==> If need key most more offen
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + " ==> " + map.get(k));
        }
    }
}
