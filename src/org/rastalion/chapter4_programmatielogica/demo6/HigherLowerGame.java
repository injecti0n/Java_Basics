package org.rastalion.chapter4_programmatielogica.demo6;

import java.util.Random;
import java.util.Scanner;

/*
In deze demo gaan we gebruik maken
van een random generator.
 */

public class HigherLowerGame {

    public static void main (String[] args) {

        Scanner kbd = new Scanner(System.in);

        //We gaan een boolean gebruiken als flag.
        boolean guessed = false;

        //Laat ons even de Java API docs bekijken
        Random random = new Random();

        int numberToGuess = random.nextInt(100);
        System.out.println("Enter a number:");

        while (!guessed) {
            int guess = kbd.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher!");
                System.out.println("Enter a number:");
            } else {
                if (guess > numberToGuess) {
                    System.out.println("Lower!");
                    System.out.println("Enter a number:");
                } else {
                    System.out.println("Guessed.");
                    guessed = true;
                }
            }
        }

        //Moeten we nog iets doen?
//        kbd.close();

    }

}
