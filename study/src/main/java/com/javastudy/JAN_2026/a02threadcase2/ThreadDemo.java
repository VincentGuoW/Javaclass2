package com.javastudy.JAN_2026.a02threadcase2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRun mt1 = new MyRun();
        MyRun mt2 = new MyRun();
        Thread t1 = new Thread(mt1,"thread 1");
        Thread t2 = new Thread(mt2,"thread 2");
        t1.setName("1");
        t2.setName("2");
        t1.start();
        t2.start();
    }
}
