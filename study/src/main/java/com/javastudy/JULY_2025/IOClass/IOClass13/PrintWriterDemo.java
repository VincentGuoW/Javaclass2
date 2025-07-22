package com.javastudy.JULY_2025.IOClass.IOClass13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass13\\test.txt"),
                true);
        pw.write("This is a sample.\r\n");// not wokr with autoFlush
        pw.println("This is second test!!!!!");// work with autoFlush
        // And anything above still in the memory will print/write in
        pw.write("Thired one");// not wokr with autoFlush
        // pw.flush();

        // pw.close();
    }
}
