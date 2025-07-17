package com.javastudy.JULY_2025.IOClass.IOClass07;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class fileReaderTest {
    public static void main(String[] args) throws IOException {
        /*
        txt file: 2-1-9-4-7-8
        ===>
        txt file: 1-2-4-7-8-9 
         
    
        */

        FileReader fr = new FileReader("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass07\\test.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while ((len=fr.read())!=-1) { 
            sb.append((char)len);
        }
        //sb.toString() --> "2-1-9-4-7-8"
        
        Integer[] intArr = Arrays
        .stream(sb.toString().split("-"))
        //.map((String t) -> Integer.valueOf(t)).forEach(null);
        .map(Integer::parseInt)
        .sorted()
        .toArray(Integer[]::new);

        FileWriter fw = new FileWriter("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass07\\test.txt");
        String s = Arrays.toString(intArr).replace(", ", "-");
        String result = s.substring(1,s.length()-1);
        fw.write(result);


        fr.close();
        fw.close();
    }
}
