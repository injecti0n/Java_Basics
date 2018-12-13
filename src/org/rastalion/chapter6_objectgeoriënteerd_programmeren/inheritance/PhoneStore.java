package org.rastalion.chapter6_objectgeoriënteerd_programmeren.inheritance;

/**
 * Created by Mrrobot on 30/03/2018 javaBasics.
 */
public class PhoneStore {

    public static void main (String[] args) {

        Blackberry berry = new Blackberry("Blackberry", "Rasberry pi", "8700g");
        Android droidy = new Android("Oneplus", "OxygenOS", "3", 699);

        //Hoe komt dit?
        System.out.println(berry);
        System.out.println(droidy);

    }

}
