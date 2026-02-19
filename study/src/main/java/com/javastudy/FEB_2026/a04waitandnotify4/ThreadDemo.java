package com.javastudy.FEB_2026.a04waitandnotify4;

public class ThreadDemo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        cook.start();
        foodie.start();
    }
}
