package com.javastudy.FEB_2026.a04waitandnotify4;

public class Desk {
    static int foodFlag = 0; // boolean is fine, int give more option
    static int count = 10;   // Max number foodie can handle, 10 dish max
    static Object lock = new Object();
}
