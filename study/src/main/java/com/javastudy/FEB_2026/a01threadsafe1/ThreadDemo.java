package com.javastudy.FEB_2026.a01threadsafe1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("Window 1");
        mt2.setName("Window 2");
        mt3.setName("Window 3");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
