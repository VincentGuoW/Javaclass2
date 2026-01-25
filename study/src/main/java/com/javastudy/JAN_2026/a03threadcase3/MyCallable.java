package com.javastudy.JAN_2026.a03threadcase3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i <100; i++) {
            result++;
        }
        return result;

    }
    
}
