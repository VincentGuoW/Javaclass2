package com.javastudy.JULY_2025.IOClass.IOClass06;

import java.io.FileWriter;
import java.io.IOException;

public class flushAndCloseDemo {
    public static void main(String[] args) throws IOException {
        //FileReader fr = new FileReader("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass06\\test.txt");
        //fr.read();

        //when FileWriter, test.txt will become empty!!!!!
        //It can prove fr has buffer!!!!
        FileWriter fw = new FileWriter("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass06\\test.txt");
        fw.write("A");
        fw.write("A");
        fw.write("A");
        fw.flush();
        for (int i = 0; i < 8192; i++) {
            fw.write("B");
        }
        fw.flush();
        fw.write("A");
        fw.write("A");
        fw.write("A");
        fw.write("A");
        fw.close();
    }
}
