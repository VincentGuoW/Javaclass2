package com.javastudy.JUNE_2025.Class03;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom,12", "Sam,14", "Henry,10", "Lee,19", "Tommy,112", "Tim,132");

        list.stream().map(s -> new Student(s)).forEach(System.out::println);
        list.stream().map(Student::new).forEach(System.out::println);
        //public Student(String studentInfo)
        //input is string, out put student, so Student::new will work
        /*
         * list.stream().map(s->new Student(s)).collect(Collectors.toList());
         * 
         * return new CollectorImpl<>(ArrayList::new, List::add,
         * (left, right) -> { left.addAll(right); return left; },
         * CH_ID);
         * test
         */
        
    }
}