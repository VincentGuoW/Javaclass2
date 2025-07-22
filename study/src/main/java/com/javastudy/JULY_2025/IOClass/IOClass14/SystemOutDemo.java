package com.javastudy.JULY_2025.IOClass.IOClass14;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        System.out.println();
        // public static final PrintStream out = null;

        PrintStream ps = System.out;
        ps.println("Sample");

        // 1.print data
        // 2.change line
        // 3.auto frash

        ps.close();

        ps.println("This won't show, becasue it close()");
        System.out.println("This still now work");
    }
}
