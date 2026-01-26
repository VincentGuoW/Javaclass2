package com.javastudy.JAN_2026.a04threadcase4;

public class ThreadDemo {
    public static void main(String[] args) {
        //PRIORITY       1-->10
        //NORM_PRIORITY  5
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Current Main Thread priority: "+Thread.currentThread().getPriority());
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "T1");
        Thread t2 = new Thread(mr, "T2");
        System.out.println();
        System.out.println("---------------------------");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println();
        System.out.println("---------------------------");
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

    }
}
