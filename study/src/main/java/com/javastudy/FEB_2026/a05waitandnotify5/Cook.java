package com.javastudy.FEB_2026.a05waitandnotify5;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("Food");//put will wait if not ready
            //queue.add("Food") not wait, no space-> error
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
