package com.javastudy.FEB_2026.a05waitandnotify5;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(1);
        Cook c = new Cook(abq);
        Foodie f = new Foodie(abq);

        c.start();
        f.start();
    
    }
}
