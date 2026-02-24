package com.javastudy.March_2026.Class01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        System.out.println();
        Class clazz = Class.forName("com.javastudy.March_2026.Class01.Student");

        Constructor[] cons = clazz.getConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);
            // public com.javastudy.March_2026.Class01.Student(int,java.lang.String)
            // public com.javastudy.March_2026.Class01.Student(java.lang.String)
            // public com.javastudy.March_2026.Class01.Student()
        }

        System.out.println();
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor constructor : cons2) {
            System.out.println(constructor);
        }

        /*
         * public com.javastudy.March_2026.Class01.Student()
         * private com.javastudy.March_2026.Class01.Student(java.lang.String,int)
         * public com.javastudy.March_2026.Class01.Student(java.lang.String)
         * public com.javastudy.March_2026.Class01.Student(int,java.lang.String)
         * protected com.javastudy.March_2026.Class01.Student(int)
         * 
         */
        System.out.println("This is the start!!!!!!!!!");
        Constructor cons3 = clazz.getDeclaredConstructor();
        Constructor cons4 = clazz.getDeclaredConstructor(String.class);
        Constructor cons5 = clazz.getDeclaredConstructor(int.class);
        Constructor cons6 = clazz.getDeclaredConstructor();
        Constructor cons7 = clazz.getDeclaredConstructor(String.class, int.class);

        System.out.println(cons3);
        System.out.println(cons4);
        System.out.println(cons5);
        System.out.println(cons6);
        System.out.println(cons7);


        int modifiers = cons4.getModifiers();
        System.out.println(modifiers); // 1 ==> public


        Parameter[] parameters = cons7.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);//String name  int age
        }
    }
}
