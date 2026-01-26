package com.javastudy.JAN_2026.a03threadcase3;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println();
        System.out.println();
        //Define what to do
        MyCallable mc1 = new MyCallable();
        MyCallable mc2 = new MyCallable();
        //package what to do == make it runnable
        FutureTask<Integer> ft1 = new FutureTask<>(mc1);
        FutureTask<Integer> ft2 = new FutureTask<>(mc2);
        //create thread(runnable) to get ready to do
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2,"Thread 2");
        //start thread to do each of them, where it start working
        t1.start();
        t2.start();

        Integer in1 = ft1.get();
        System.out.println(in1);
        System.out.println(ft2.get());
    }
}
