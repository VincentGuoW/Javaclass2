package com.javastudy.JULY_2025.FileSection.FileClass7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOInputDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File txtFile = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass7\\test.txt");
        //"abcd"
        FileInputStream fis =new FileInputStream(txtFile);
        int intRead1 = fis.read();  //a
        System.out.println(intRead1);
        //This is steam, the cursor/pointer will move and not go back!!!!!
        byte[] byteArr = fis.readAllBytes();    //bcd
        //StringBuilder sb = new StringBuilder();
        //for (byte b : byteArr) {
        //    sb.append(b);
        //}
        //System.out.println(sb.toString());
        String text = new String(byteArr);
        System.out.println(text);


        System.out.println(fis.read());//if empty == -1 !!!!!!
        fis.close();
    }
}
