package com.javastudy.JULY_2025.IOClass.IOClass08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         /*
        BufferedInputStream
        BufferedOutputStream
        BufferedReader
        BufferedWriter
        */

        BufferedReader br = new BufferedReader(new FileReader("D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass08\\test.txt") );
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass08\\test2.txt"));
    
        String line1 = br.readLine();
        bw.write(line1);

        bw.newLine();//newLine ==> best part is works for all system windows ios ..

        String line2 = br.readLine();
        bw.write(line2);

        br.close();
        bw.close();
        
    }
}
