package com.javastudy.JAN_2026.a01threadcase1;

import java.util.ArrayList;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("Thread_One");
        t2.setName("Thread_Two");
        t3.setName("Thread_Three");
        t1.start();
        t2.start();
        t3.run();
        //must be .start() not .run()
        //.start ==> will give multiple thread
        //.run   ==> just keep in same thread
    }
    
    
}
