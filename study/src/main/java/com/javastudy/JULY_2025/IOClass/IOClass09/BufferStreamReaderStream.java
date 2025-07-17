package com.javastudy.JULY_2025.IOClass.IOClass09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferStreamReaderStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(
                new FileInputStream(
                    "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass09\\test.txt"
                ), "UTF-8"
            )
        );
        String line;
        while ((line=br.readLine())!=null) { 
            System.out.println(line);
        }
        br.close();
    }
}
