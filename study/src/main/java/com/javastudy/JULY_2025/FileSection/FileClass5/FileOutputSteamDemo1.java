package com.javastudy.JULY_2025.FileSection.FileClass5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass5\\test.txt");
        fos.write(95);
        fos.write('9');
        fos.write('5');
        fos.write(' ');
        byte[] bArr = {'a','b','c','d','e'};
        fos.write(bArr);
        fos.write(' ');
        fos.write(bArr, 1, 2);


        fos.close();
    }
}
