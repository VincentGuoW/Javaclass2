package com.javastudy.JULY_2025.IOClass.IOClass02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();//UTF-8
        System.out.println(Arrays.toString(bytes1));//[97, 105, -28, -67, -96, -27, -109, -97]
    
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));// [97, 105, -60, -29, -45, -76]


        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes1,"UTF-8");
        System.out.println(str3);

        String str4 = new String(bytes2,"GBK");
        System.out.println(str4);
    }
}
