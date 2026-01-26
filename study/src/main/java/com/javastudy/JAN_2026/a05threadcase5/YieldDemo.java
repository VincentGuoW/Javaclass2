package com.javastudy.JAN_2026.a05threadcase5;

public class YieldDemo {
    public static void main(String[] args) {
        MyThead mt1 = new MyThead();
        MyThead mt2 = new MyThead();
        mt1.setName("T1");
        mt2.setName("T2");
        mt1.start();
        mt2.start();
    }

    static class MyThead extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+" @ " + i);
                Thread.yield();
            }
        }
    }
} 
