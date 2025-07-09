package com.javastudy.JULY_2025.FileSection.FileClass1;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass1\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        String parent = "D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass1";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);

        File parent2 = new File("D:\\Vincent\\JavaClass\\study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass1");
        String child2 = "a.txt";
        File f4 = new File(parent2, child2);
        System.out.println(f4);

        
    }
}
