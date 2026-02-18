package com.javastudy.FEB_2026.a01threadsafe1;

public class MyThread extends Thread {
    static int ticket = 0; // must be static so all thread share same pool
    static Object objLock = new Object(); // They have to share the same lock

    int eachSale = 0;


    @Override
    public void run() {
        while (true) {
            synchronized (objLock) {//MyThread.class also works
                // synchronized is a lock
                // Makesure no other thread run same part same time
                if (ticket < 100) {
                    ticket++;
                    System.out.println(this.getName() + " is selling #" + ticket + " ticket");
                    eachSale++;
                    
                    try {
                        Thread.yield();
                        sleep(100);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("No More Tickets "+this.getName()+ " sold "+ eachSale);
                    break;
                }
            }

        }
    }
}
