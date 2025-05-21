package com.javastudy.MAY_2025;

import java.security.KeyStore.Entry;
import java.util.HashMap;
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

        Map.of(); // max 10
        //There's limit for map.of() ==> max 10!!!
        //E.g.
        // public static<k,v> void of(k...keys,v...values)
        //Will cus error, they can't define which part is keys or values

        Map<String,String> maps = Map.ofEntries(
            Map.entry("a", "b"),
            Map.entry("a", "b"),
            Map.entry("a", "b"),
            Map.entry("a", "b")
        );

        HashMap<String,String> hm = new HashMap<>();
        hm.put("A", "b");
        hm.put("A", "b");
        hm.put("A", "b");
        hm.put("A", "b");
        hm.put("A", "b");

        //hm is HashMap ==> part of map
        //Set => Map.Entry == entrySet
        Set<Map.Entry<String  ,String >> setSample = hm.entrySet();

    }
}
