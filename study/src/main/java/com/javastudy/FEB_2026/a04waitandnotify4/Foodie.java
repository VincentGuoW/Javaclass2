package com.javastudy.FEB_2026.a04waitandnotify4;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true) {
           synchronized(Desk.lock){
            if (Desk.count==0) {
                break;
            } else {
                if (Desk.foodFlag==0) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    Desk.lock.notifyAll();
                }else{
                    Desk.count--;

                    System.out.println("Still :" + Desk.count+" left!");
                    Desk.lock.notifyAll();
                    Desk.foodFlag = 0;
                }
            }
           }
        }
    }
}
