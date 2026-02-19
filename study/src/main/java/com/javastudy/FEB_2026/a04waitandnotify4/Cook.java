package com.javastudy.FEB_2026.a04waitandnotify4;

public class Cook extends Thread{
    @Override
    public void run() {
       while (true) {
         synchronized(Desk.lock){//why desk.lock not desk.class?
            if (Desk.count==0) {
                System.out.println("Hit the max the foodie can handle");
                break;
            } else {
                if (Desk.foodFlag==1) { // food on table
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else { //no food on table
                    System.out.println("Start cooking");
                    Desk.foodFlag=1;
                    Desk.lock.notifyAll();
                }
            }
         }
       }
    }
}
