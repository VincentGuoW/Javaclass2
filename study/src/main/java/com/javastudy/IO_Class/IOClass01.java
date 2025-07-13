package com.javastudy.IO_Class;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOClass01 {
    public static void main(String[] args) throws IOException {
        //create stream (connection) with the txt file
        //auto creat file if file not exist(source location should be exist)
        FileOutputStream fos = new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\IO_Class\\DemoTxt1.txt");
        
        //file.getParentFile().mkdirs() ==> create all folder

        //write something in that txt file (remove everything first)
        fos.write(97);  //ASCII 97=='a'   98=='b'
        fos.write('c');  //ASCII 97=='a'   98=='b'

        //close the stream (close connection) with txt file
        fos.close();
    
    
    }
}
