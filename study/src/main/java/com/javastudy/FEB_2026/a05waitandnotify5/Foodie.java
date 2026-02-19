package com.javastudy.FEB_2026.a05waitandnotify5;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();//take will take it out
                System.out.println(food);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
