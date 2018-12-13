package org.rastalion.chapter4_programmatielogica.demo5;

import java.util.Scanner;

/**
 * Created by Mrrobot on 22/03/2018 javaBasics.
 * <p>
 * <p>
 * Simple switch example
 */

public class SwitchExample {

    public static void main (String[] args) {

        int choice;
        boolean fulfilled = false;

        Scanner kbd = new Scanner(System.in);

        do {
            System.out.println("give a number between 1-5");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("quote 1");
                    fulfilled = true;
                    break;
                case 2:
                    System.out.println("quote 2");
                    fulfilled = true;
                    break;
                case 3:
                    System.out.println("quote 3");
                    fulfilled = true;
                    break;
                case 4:
                    System.out.println("quote 4");
                    fulfilled = true;
                    break;
                case 5:
                    System.out.println("quote 5");
                    fulfilled = true;
                    break;
                default:
                    System.out.println("Incorrect number given.\n" +
                            "Machine will detonate in a few seconds...");
            }
        } while (!fulfilled);

    }

}
