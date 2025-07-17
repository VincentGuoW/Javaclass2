package com.javastudy.JULY_2025.IOClass.IOClass08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemoMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("study/src/main/java/com/javastudy/JULY_2025/IOClass/IOClass08/test.txt"));
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("study/src/main/java/com/javastudy/JULY_2025/IOClass/IOClass08/test3.txt"));

        String line;
        while ((line=br.readLine())!=null) { 
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
