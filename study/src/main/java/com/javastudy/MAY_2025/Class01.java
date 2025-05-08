package com.javastudy.MAY_2025;

import java.util.HashMap;

public class Class01 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashMap<String, String> test = new HashMap<String, String>();
        
        int size1 = 0;
        if(++size1 >0){
            System.out.println("++Yes"); // ++Yes  
        }
        int size2 = 0;
        if(size2++ >0){
            System.out.println("Yes++"); // null
        }
        int size3 = 0;
        if((size3++) >0){
            System.out.println("(Yes++)"); // null
        }

        int size = 0;
        int result = (size++ + 1) * (size++ + 2); //0+1 * 1+2 =3
        System.out.println(result);

    }
}
