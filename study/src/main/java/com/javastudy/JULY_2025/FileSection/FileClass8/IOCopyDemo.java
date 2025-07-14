package com.javastudy.JULY_2025.FileSection.FileClass8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopyDemo {
    public static void main(String[] args) throws IOException {
        //copy byte one by one 
        long startTime = System.nanoTime();
        File mainFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass8\\image.png");
        File copyFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass8\\copy.png");
        FileInputStream fis = new FileInputStream(mainFile);
        FileOutputStream fos = new FileOutputStream(copyFile);
        int b;
        while ((b=(fis.read()))!=-1) { 
            fos.write(b);
        }
        fis.close();
        fos.close();
        long endtime = System.nanoTime();
        System.out.println(endtime-startTime);
    }
}
