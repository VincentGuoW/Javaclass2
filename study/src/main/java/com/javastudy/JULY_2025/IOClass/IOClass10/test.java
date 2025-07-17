package com.javastudy.JULY_2025.IOClass.IOClass10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass10\\test.txt");
        FileOutputStream fos = new FileOutputStream(file);

        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            fos.write(r.nextInt(95)+32);
            if(i%10==9){
                fos.write('\r');
                fos.write('\n');
            }
        }
        fos.close();
    }
}
