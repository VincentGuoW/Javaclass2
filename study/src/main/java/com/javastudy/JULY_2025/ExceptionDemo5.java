package com.javastudy.JULY_2025;

import java.awt.AWTError;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 5, 6 }; // 1
        try {
            System.out.println(arr[10]); // 2
            System.out.println(2 / 0);// skip this cus it will triger catch
        } catch (ArrayIndexOutOfBoundsException e) { // 3
            System.out.println(e); // 4
        } catch (AbstractMethodError | AWTError e) { // we can put two exception in one with "|"
            System.out.println(e);
        } catch (ArithmeticException e) { // son
            System.out.println(e);
        } catch (RuntimeException e) { // fater
            System.out.println(e);
        } catch (Exception e) { // grandfather
            System.out.println(e);
        }
        System.out.println("-----End-----"); // 5
    }
}
