package com.javastudy.JAN_2026.a02threadcase2;

public class MyRun implements Runnable{
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Thread "+Thread.currentThread().getName());

            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+ " Sample 2");
        }
    }
    
}
