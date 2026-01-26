package com.javastudy.JAN_2026.a05threadcase5;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        MyRunnable2 mr2 = new MyRunnable2();

        Thread t1 = new Thread(mr,"Major");
        Thread t2 = new Thread(mr2,"Whatever");

        t1.setPriority(10);
        t2.setPriority(1);

        t2.setDaemon(true);

        t1.start();
        t2.start();


    }
}
