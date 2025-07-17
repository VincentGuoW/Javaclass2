package com.javastudy.JULY_2025.IOClass.IOClass04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass04\\test.txt");
        fr.read();

        //when FileWriter, test.txt will become empty!!!!!
        //It can prove fr has buffer!!!!
        FileWriter fw = new FileWriter("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass04\\test.txt");
        int charInt;
        while((charInt = fr.read())!=-1){
            System.out.println((char)charInt);
        }
        fr.close();
        fw.close();
    }
}
