package com.javastudy.FEB_2026.a02threadsafe2;

public class MyRunnable implements Runnable {
    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (method())
                break;

        }
    }

    private synchronized boolean method() {
        if (ticket == 100) {
            
            return true;
        } else {try {
                Thread.sleep(10);
                ticket++;
                System.out.println(Thread.currentThread().getName() + " ticket # " + ticket);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return false;
        }
    }

}
