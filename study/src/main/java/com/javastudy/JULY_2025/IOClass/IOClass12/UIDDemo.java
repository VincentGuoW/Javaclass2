package com.javastudy.JULY_2025.IOClass.IOClass12;

import java.io.ObjectStreamClass;

public class UIDDemo {
    public static void main(String[] args) {
        // 1. Must have implement Serilizable
        // 2.lookup xxx.class not xxx.java
        // Student.class ==uid==> 2233658971839118397
        Long result = ObjectStreamClass.lookup(com.javastudy.JULY_2025.IOClass.IOClass12.Student.class)
                .getSerialVersionUID();
        System.out.println(result);
    }
}
