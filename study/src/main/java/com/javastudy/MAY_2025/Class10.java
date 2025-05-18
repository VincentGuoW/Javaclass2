package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.HashMap;

public class Class10 {
    public static void main(String[] args) {
        // RQ
        // Map ==> key = province ; value = city;
        // only one provance, a lot of city
        // result as : province = city1, city2, city3

        HashMap<String, ArrayList<String>> provinceHashMap = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        ArrayList<String> city4 = new ArrayList<>();
        city1.add("aaa");
        city1.add("bbb");
        city1.add("ccc");
        city1.add("ddd");

        city2.add("bbb");
        city2.add("aaa");
        city2.add("ccc");
        city2.add("ddd");

        city3.add("ddd");
        city3.add("bbb");
        city3.add("ccc");
        city3.add("aaa");

        city4.add("ccc");
        city4.add("bbb");
        city4.add("aaa");
        city4.add("ddd");

        provinceHashMap.put("P1",city1);
        provinceHashMap.put("P2",city2);
        provinceHashMap.put("P3",city3);
        provinceHashMap.put("P4",city4);

        for(String province : provinceHashMap.keySet()){
            ArrayList<String> city = provinceHashMap.get(province);
            System.out.println("Province == " + province + " ~~~~~~~");
            for (int i = 0; i < city.size(); i++) {
                System.out.println(city.get(i));
            }
            
        }
    }
}
