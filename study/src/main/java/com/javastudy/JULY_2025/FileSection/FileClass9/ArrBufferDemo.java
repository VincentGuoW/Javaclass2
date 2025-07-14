package com.javastudy.JULY_2025.FileSection.FileClass9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ArrBufferDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass9\\test.txt");
        FileInputStream fis = new FileInputStream(inputFile);
        byte[] byteArr = new byte[4];

        int result1 = fis.read(byteArr);
        System.out.println(result1);//4
        String btA1 = new String(byteArr);
        System.out.println(btA1);//abcd

        int result2 = fis.read(byteArr);
        System.out.println(result2);//4
        String btA2 = new String(byteArr);
        System.out.println(btA2);//efgh

        int result3 = fis.read(byteArr);
        System.out.println(result3);//1
        String btA3 = new String(byteArr,0,result3);
        System.out.println(btA3);//ifgh ==> i || (fgh) from the previous

        /*
        Buffer==>
        int bufferLength = fis.read(array)
        1. fis.read(array) => will get how many byte doea it take this time
        2. array           => will update to new array
        
         */
        //int result4 = fis.read(byteArr);
        //System.out.println(result4);//0
        //String btA4 = new String(byteArr,0,result4);//only show added result
        //System.out.println(btA4);
    }
}
