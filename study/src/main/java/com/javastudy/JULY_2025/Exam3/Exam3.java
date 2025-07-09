package com.javastudy.JULY_2025.Exam3;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Girlfriend gf = new Girlfriend();
        while (true) {
            try {
                System.out.println("Enter name (3-10 characters):");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("Enter age (18-40):");
                int age = Integer.parseInt(sc.nextLine());
                gf.setAge(age);
                System.out.println(gf);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
