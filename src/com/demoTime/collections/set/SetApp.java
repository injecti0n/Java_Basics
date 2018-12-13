package com.demoTime.collections.set;

import com.demoTime.collections.enitities.Person;
import com.demoTime.collections.enitities.PersonsEqualsHash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mrrobot on 23/05/2018 javabasics-workspace.
 */
public class SetApp {

    public static void main (String[] args) {

        Set<PersonsEqualsHash> listOfSlaves = new HashSet<>();
        listOfSlaves.add(new PersonsEqualsHash("Alex","Keisse",28,92,1.89));
        listOfSlaves.add(new PersonsEqualsHash("Alex","Keisse",28,92,1.89));
        listOfSlaves.add(new PersonsEqualsHash("Bart","Herr",27,72,1.82));
        listOfSlaves.add(new PersonsEqualsHash("Patrick","jaaaah",32,84,1.78));


        /*
        Eerst de HashSet
         */
        Set<Person> secListOfSlaves = new HashSet<>();
        secListOfSlaves.add(new Person("Alex","Keisse",28,92,1.89));
        secListOfSlaves.add(new Person("Alex","Keisse",28,92,1.89));
        secListOfSlaves.add(new Person("Bart","Herr",27,72,1.82));
        secListOfSlaves.add(new Person("Patrick","jaaaah",32,84,1.78));

        /*
        Hashed persons
         */
        System.out.println("Overwritten hash en equals");
        listOfSlaves.forEach(System.out::println);
        System.out.println();

        /*
        No hashing bitch
         */
        System.out.println("No overwritten hash en equals!!");
        secListOfSlaves.forEach(System.out::println);
        System.out.println();

        /*
        Show linkedList always respect order added.

        Use .hash( ) to demonstrate
         */
//        Set<PersonsEqualsHash> thirdListOfSlaves = new LinkedHashSet<>();
//        thirdListOfSlaves.add(new PersonsEqualsHash("Alex","Keisse",28,92,1.89));
//        thirdListOfSlaves.add(new PersonsEqualsHash("Bart","Herr",27,72,1.82));
//
//        thirdListOfSlaves.forEach(System.out::println);
    }

}
