package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.Collections;

public class Class05 {
    public static void main(String[] args) {
        //There's number of N student in the class, random pick one
        //Use Collections, not random()
        ArrayList<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, "A","B","C","D","E","F","G");
        Collections.shuffle(studentList);
        System.out.println(studentList.get(0));
    }
}
