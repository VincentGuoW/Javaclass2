package com.javastudy.MAY_2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Class12 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("A", "b");
        hm.put("Aa", "b");
        hm.put("Ab", "b");
        hm.put("Ac", "b");
        hm.put("Ad", "b");

        //Use data above get an unmutable array

        //1.Get Map.Entry's set
        Set<HashMap.Entry<String, String>> hmSet = hm.entrySet();
        
                //turn entries into a array
                //Object[] obj = hmSet.toArray();
                //for (Object o : obj) {
                //    System.out.println(o);
                //}
        //2.Set Array type  [0]==> Java will auto adjust size     
        Map.Entry<String,String>[] arr1 = new Map.Entry[0];
        //3.Change Set into Array type I just made
        Map.Entry<String,String>[] arr2 = hmSet.toArray(arr1);

        //4.Use ofEntries get from array
        //PS!! each element inside the array is an Entry!!!!
        //It's not return one array or one entry
        //It return an array full of entries!!!!!
        Map<String,String> map = Map.ofEntries(arr2);

        //copyOf == simple way
        Map<String, String> map2 = Map.copyOf(hm);

        System.out.println( map );
        System.out.println( map2 );

      

    }
}
