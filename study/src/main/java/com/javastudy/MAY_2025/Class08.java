package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.Collections;

public class Class08 {
    public static void main(String[] args) {
        // pick student once, until next roll; test
        ArrayList<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, "aa", "bb", "cc", "dd", "ee");
        ArrayList<String> templateList = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            System.out.println("ROUND "+ j +" !");
            int maxStudentList = studentList.size();
            for (int i = 0; i < maxStudentList; i++) {
                Collections.shuffle(studentList);
                Collections.addAll(templateList, studentList.get(0));
                System.out.println(studentList.remove(0)); // size getting smaller each time
            }

            studentList.addAll(templateList);
            templateList.clear();
        }

    }
}
