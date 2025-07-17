package com.javastudy.JULY_2025.IOClass.IOClass10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExtaTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass10\\test2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass10\\test2.txt"));

        String line = br.readLine();
        System.out.println(line);//null
        br.close();
        bw.close();
        //Reader will open it, writer will remove it.
        //Code runing from the top, after define bw, the test2.txt file will become empty
        //Then readline will just empty txt file, so it will be null!!!!!!!!!!!!
    }
}
