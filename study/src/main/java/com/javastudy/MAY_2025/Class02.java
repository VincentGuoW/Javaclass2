package com.javastudy.MAY_2025;

public class Class02 {
    public static void main(String[] args) {
        /*
        How Hashcode work
            e.g. 
                String sample = "abc";
                sample.hashcode = 96354;
        All object has hashcode() method.
        
        Treecode
             test test   
         */

         String sample = "abc";
         int sampleHashcode =sample.hashCode();
         System.out.println(sampleHashcode);
    }
}
