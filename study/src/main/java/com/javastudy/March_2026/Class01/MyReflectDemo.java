package com.javastudy.March_2026.Class01;

import java.lang.reflect.Constructor;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println();
        Class clazz = Class.forName("com.javastudy.March_2026.Class01.Student");

        Constructor[] cons = clazz.getConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);
            
        }
    }
}
