package com.javastudy.JULY_2025;

import java.nio.channels.AcceptPendingException;

public class ExceptionDemo6 {
    public static void main(String[] args) {
         int[] arr = { 1, 23, 4, 5, 6 }; // 1
        try {
            System.out.println(arr[10]); // 2
            System.out.println(2 / 0);// skip this cus it will triger catch
        } catch (AcceptPendingException e) { // 3 but use java's exception
            System.out.println(e); // wrong exception
        } 
        System.out.println("-----End-----"); // 4
    }
}
