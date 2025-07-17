package com.javastudy.JULY_2025.IOClass.IOClass05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SecureFileDemo {
    public static void main(String[] args) throws IOException  {
        /*
         *encryption:   
            5(value)  ^ 2(key) ==> 101 ^ 010 ==> 7(result) ( 111 ) 
         * Then reverse
            7(result) ^ 2(key) ==> 111 ^ 010 ==> 5(value) ( 101 ) 
         */
        FileInputStream fis = new FileInputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass05\\image1.png");
        FileOutputStream fos = new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass05\\image2.png");
        
        byte[] byteArr = new byte[1024*1024];
        int length;
        int key = 123;
        while((length=fis.read(byteArr))!=-1){
            for (int i = 0; i < length; i++) {
                System.out.println("The byte is: " + byteArr[i]);
                byteArr[i] = (byte)(byteArr[i]^key);
            }
            fos.write(byteArr, 0, length);
        }
        fis.close();
        fos.close();
    
    }
}
