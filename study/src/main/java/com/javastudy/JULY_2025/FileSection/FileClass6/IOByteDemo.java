package com.javastudy.JULY_2025.FileSection.FileClass6;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOByteDemo {
    public static void main(String[] args) throws IOException {
        //FileOutputStream("path",true)---> keep writing, not start over
        FileOutputStream fos = new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass6\\test.txt",true);
        String input = "This is a sample of test";
        byte[] byteInput = input.getBytes();
        fos.write(byteInput);

        String input2 = "\r\n";
        byte[] byteInput2 = input2.getBytes();
        fos.write(byteInput2);

        fos.write('A');
        fos.write('A');
        fos.write('A');

        fos.close();
    }
}
