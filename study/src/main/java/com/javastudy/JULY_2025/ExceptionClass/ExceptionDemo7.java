package com.javastudy.JULY_2025.ExceptionClass;


public class ExceptionDemo7 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 1, 23, 4, 5, 6 }; 
        try {
            System.out.println(arr[10]); 
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("-----------------");
            System.out.println(e.getMessage()); 
            System.out.println("-----------------");
            System.out.println(e.toString()); 
            System.out.println("-----------------");
            e.printStackTrace();
        } 
        System.out.println("-----End-----"); 
        //System.err.println(123);
    }
}
