package com.javastudy.JULY_2025.FileSection.FileClass10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BetterCopyDemo {
    public static void main(String[] args) throws IOException {
        long StartTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass10\\image.png");
        FileOutputStream fos = new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass10\\copy.png");
        
        byte[] copyByte = new byte[1240*1240*5];
        int byteLength;
        while ((byteLength = fis.read(copyByte))!=-1) { 
            fos.write(copyByte,0,byteLength);
        }
        fos.close();
        fis.close();
        long EndTime = System.currentTimeMillis();
        System.out.println(EndTime-StartTime);
    }
}
