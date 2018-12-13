package org.rastalion.chapter4_programmatielogica.demo3;

import java.util.Scanner;

public class Age2 {

    public static void main (String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = kbd.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            if (age >= 10) {
                System.out.println("You are a teenager");
            } else {
                if (age >= 2) {
                    System.out.println("You are a child");
                } else {
                    System.out.println("You are a baby");
                }
            }
        }

        kbd.close();

    }
}
