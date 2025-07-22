package com.javastudy.JULY_2025.IOClass.IOClass13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass13\\test.txt");
        PrintStream ps2 = new PrintStream(
                new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass13\\test.txt"),
                true, "UTF-8");
        // Auto flash ==> memory full / xxx.close() ==> then put data in
        ps.print("A");
        ps.println("B");
        ps.println(97);
        ps.write(97);
        ps.printf("%s InLove %s", "Tom", "Henry");
        ps2.append("c");
        ps.close();
        ps2.close();

    }
}
