package com.javastudy.JULY_2025.IOClass.IOClass10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExamStream1 {
    public static void main(String[] args) throws IOException {
        /*
            1.basic stream: one byte at a time
            2.basic stream: one byte[] at a time
            3.bufferstream: one byte at a time
            4.bufferstream: one byte[] at a time

            calcualte the time cost
        */
        File inputFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass10\\test.txt");
        File outputFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass10\\test2.txt");
        
        //1.
        long time1Start = System.currentTimeMillis();
        FileInputStream fis1 = new FileInputStream(inputFile);
        FileOutputStream fos1 = new FileOutputStream(outputFile);

        int len1;
        while ((len1=fis1.read())!=-1){
            fos1.write(len1);
        }
        long time1End = System.currentTimeMillis();
        System.out.println("Test1 take time: "+ (time1End-time1Start));
        fis1.close();
        fos1.close();

        //2.
        long time2Start = System.currentTimeMillis();
        FileInputStream fis2 = new FileInputStream(inputFile);
        FileOutputStream fos2 = new FileOutputStream(outputFile);

        int len2;
        byte[] byteArr = new byte[8192];
        while ((len2=fis2.read(byteArr))!=-1){
            fos2.write(byteArr,0,len2);
        }
        long time2End = System.currentTimeMillis();
        System.out.println("Test2 take time: "+ (time2End-time2Start));
        fis2.close();
        fos2.close();

        //3.
        long time3Start = System.currentTimeMillis();
        FileInputStream fis3 = new FileInputStream(inputFile);
        FileOutputStream fos3 = new FileOutputStream(outputFile);
        BufferedInputStream bis3 = new BufferedInputStream(fis3);
        BufferedOutputStream bos3 = new BufferedOutputStream(fos3);
        int len3;
        while ((len3=bis3.read())!=-1){
            bos3.write(len3);
        }
        long time3End = System.currentTimeMillis();
        System.out.println("Test4 take time: "+ (time3End-time3Start));
        
        fis3.close();
        fos3.close();


         //4.
        long time4Start = System.currentTimeMillis();
        FileInputStream fis4 = new FileInputStream(inputFile);
        FileOutputStream fos4 = new FileOutputStream(outputFile);
        BufferedInputStream bis4 = new BufferedInputStream(fis4);
        BufferedOutputStream bos4 = new BufferedOutputStream(fos4);
        int len4;
        byte[] byteArr4 = new byte[8192];
        while ((len4=bis4.read(byteArr4))!=-1){
            bos4.write(byteArr4,0,len4);
        }
        
        long time4End = System.currentTimeMillis();
        System.out.println("Test4 take time: "+ (time4End-time4Start));
        
        fis4.close();
        fos4.close();
    }
}
