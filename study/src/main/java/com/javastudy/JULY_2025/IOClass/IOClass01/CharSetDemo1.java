package com.javastudy.JULY_2025.IOClass.IOClass01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CharSetDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\test.txt");
        FileInputStream inputStream = new FileInputStream(inputFile);
        File outputFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\testCopy.txt");
        FileOutputStream outputStream = new FileOutputStream(outputFile);

        byte[] b = new byte[1240 * 1240 * 5];
        int len = 0;
        try (inputStream; outputStream) {
            while (len != -1) {
                len = inputStream.read(b);
                System.out.println(new String(b,0,len,"UTF-8"));
                outputStream.write(b, 0, len);
            }

        } catch (Exception e) {
        }

    }
}
