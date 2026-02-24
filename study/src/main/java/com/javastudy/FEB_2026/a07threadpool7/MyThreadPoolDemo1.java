package com.javastudy.FEB_2026.a07threadpool7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo1 {
    public static void main(String[] args)  {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
            3,
            6,
             60, 
             TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5) );
    }
}
