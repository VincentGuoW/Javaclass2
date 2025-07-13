package com.javastudy.JULY_2025.FileSection.FileClass3;

import java.io.File;

public class FileDeleteDemo {
    public static void main(String[] args) {
        String[] sample = {};
        System.out.println();
        for (String string : sample) {
            System.out.println("This is a string");
        }
        System.out.println("This is end of the sample string");

        File src = new File("ABC:\\");
        DeleteFileTool(src);
    }

    public static void DeleteFileTool(File src){
        File[] files = src.listFiles();
        //If src.listFiles is empty folder ==>
        //files ==> [] ==> empty folder not null!!!!!
        //and the for loop below will skip to src.delete
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }
            else{
                DeleteFileTool(file);
            }
        }
        src.delete();//This is where it will delete empty folder!!!!!
    }
}
