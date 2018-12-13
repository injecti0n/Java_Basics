package org.rastalion.chapter5_java_programmeertaal.demo_methoden;

import java.util.Scanner;

public class ExampleMinNumber_1 {

    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Fill in a number:");
        int a = kbd.nextInt();
        System.out.println("Fill in a number:");
        int b = kbd.nextInt();
        int c = minFunction(a, b);
        System.out.println("Minimum Value = " + c);
    }

    /**
     * returns the minimum of two numbers
     */
    public static int minFunction (int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

}
