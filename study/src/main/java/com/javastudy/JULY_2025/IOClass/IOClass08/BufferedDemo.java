package com.javastudy.JULY_2025.IOClass.IOClass08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        /*
        BufferedInputStream
        BufferedOutputStream
        BufferedReader
        BufferedWriter
        */

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass08\\test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass08\\out.txt"));
        
        int len;
        byte[] bytes = new byte[1024*1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();

    }
}
