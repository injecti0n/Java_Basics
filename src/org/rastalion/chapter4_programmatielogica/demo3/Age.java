package org.rastalion.chapter4_programmatielogica.demo3;

/*
In dit programma gaan we een if statement gebruiken
om de flow van onze applicatie correct te laten verlopen
aan de hand van de ingegeven age.
 */

import java.util.Scanner;

public class Age {

    public static void main (String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = kbd.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }

        //Waarom gaan we deze hier pas afsluiten en niet in de if of else scope?
        kbd.close();

    }

}
