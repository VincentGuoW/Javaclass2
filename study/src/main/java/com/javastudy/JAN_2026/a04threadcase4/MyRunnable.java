package com.javastudy.JAN_2026.a04threadcase4;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
    
}
