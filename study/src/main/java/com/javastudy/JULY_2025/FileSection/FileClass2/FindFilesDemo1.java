package com.javastudy.JULY_2025.FileSection.FileClass2;

import java.io.File;

public class FindFilesDemo1 {
    // Recruision 递归
    public static void main(String[] args) {
        File src = new File("C:\\");
        System.out.println(findAVI(src));
    }

    public static boolean findAVI(File src) {
        //Key knowledge: empty folder --> files [] is empty not null!!!
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".avi")) {
                        return true;
                    }
                } else {
                    findAVI(file);
                }
            }

        }

        return false;
    }
}
