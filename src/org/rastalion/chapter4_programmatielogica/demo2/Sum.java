package org.rastalion.chapter4_programmatielogica.demo2;

import java.util.Scanner;

/*
Dit is een programma waar we
gaan gebruik maken van het scanner obj.
Hierdoor kunnen we de gebruiker om input vragen!!!
 */

public class Sum {

    public static void main (String[] args) {

        //We hebben een instantie nodig van een Scanner obj
        Scanner kbd = new Scanner(System.in);

        //We gaan de gebruiker vragen om een cijfer [geheel getal]
        System.out.println("Enter a number:");
        int a = kbd.nextInt(); //input

        //We gaan de gebruiker vragen om een tweede cijfer [geheel getal]
        System.out.println("Enter another number:");
        int b = kbd.nextInt(); //input

        /*
        We gaan de waardes optellen en in een derde variabele steken.
        En hierna printen we deze af naar de console.
         */
        int sum = a + b;
        System.out.println("The sum is: " + sum);

        //We gaan ons Scanner obj telkens afsluiten als volgt:
        kbd.close();

    }

}
