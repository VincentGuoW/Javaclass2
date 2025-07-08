package com.javastudy.JULY_2025.Exam1;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Girlfriend gf = new Girlfriend();
        String name;
        do {
            System.out.println("Enter name (3-10 characters):");
            name = sc.nextLine();
        } while (name.length() < 3 || name.length() > 10);
        gf.setName(name);

        // 输入年龄
        int age = -1;
        while (true) {
            System.out.println("Enter age (18-40):");
            try {
                age = Integer.parseInt(sc.nextLine());
                if (age >= 18 && age <= 40) {
                    break;
                } else {
                    System.out.println("Age must be between 18 and 40.");
                }
           } catch (NumberFormatException e) {
               System.out.println("Invalid number. Please enter a valid age.");
           }
        }
        gf.setAge(age);

        System.out.println(gf);
    }
}
