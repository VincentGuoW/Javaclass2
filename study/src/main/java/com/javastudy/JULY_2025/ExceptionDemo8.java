package com.javastudy.JULY_2025;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        int[] arr = null;
        int max = 0;
        try {
             max = getMax(arr);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Null in main");
            e.getStackTrace();
            max++;
        } 

        System.out.println(max);
    }

    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if (arr == null) {
            throw new NullPointerException("null inside getMax");
        }
        System.out.println("Check is it go through");

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("out bounds inside getMax");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i];
        }
        return max;
    }
}
