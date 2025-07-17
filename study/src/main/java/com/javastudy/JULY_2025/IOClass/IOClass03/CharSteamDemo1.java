package com.javastudy.JULY_2025.IOClass.IOClass03;

import java.io.FileReader;
import java.io.IOException;

public class CharSteamDemo1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader  fr =new BufferedReader( new FileReader("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass03\\test.txt"));
        FileReader  fr =new FileReader("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass03\\test.txt");
        
        int b1 = fr.read();
        
        System.out.println(b1);

        int b2 = fr.read();
        System.out.println(b2);

        int b3 = fr.read();
        System.out.println(b3);
    }
}
