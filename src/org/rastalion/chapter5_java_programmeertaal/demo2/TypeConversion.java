package org.rastalion.chapter5_java_programmeertaal.demo2;

/*
 In deze demo is het de bedoeling
 dat we spelen met explicit casten
 en kijken welk effect dit kan hebben.
 */

public class TypeConversion {

    public static void main (String[] args) {

        //verhoog int boven de byte rang [-128 => 127]

        int anInt = 5;
        short aByte;

        aByte = (byte) anInt;
        System.out.println(aByte);

    }

}
