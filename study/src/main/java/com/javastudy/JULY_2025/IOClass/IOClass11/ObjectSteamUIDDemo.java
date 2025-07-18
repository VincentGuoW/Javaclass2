package com.javastudy.JULY_2025.IOClass.IOClass11;

import java.io.ObjectStreamClass;

public class ObjectSteamUIDDemo {
    public static void main(String[] args) {
        System.out.print(ObjectStreamClass.lookup(com.javastudy.JULY_2025.IOClass.IOClass11.Student.class)
                .getSerialVersionUID());
    }
}
