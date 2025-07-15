package com.javastudy.JULY_2025.FileSection.FileClass11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        // try catch finally
        // finally use xxx.close() ==> make sure it close nomatter what.
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            long StartTime = System.currentTimeMillis();
            fis = new FileInputStream(
                    "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass10\\image.png");
            fos = new FileOutputStream(
                    "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass10\\copy.png");

            byte[] copyByte = new byte[1240 * 1240 * 5];
            int byteLength;
            while ((byteLength = fis.read(copyByte)) != -1) {
                fos.write(copyByte, 0, byteLength);
            }

            long EndTime = System.currentTimeMillis();
            System.out.println(EndTime - StartTime);
        } catch (Exception e) {

        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
}
