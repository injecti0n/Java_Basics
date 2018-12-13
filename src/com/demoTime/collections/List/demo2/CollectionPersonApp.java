package com.demoTime.collections.List.demo2;

import com.demoTime.collections.enitities.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mrrobot on 23/05/2018 javabasics-workspace.
 */
public class CollectionPersonApp {

    public static void main (String[] args) {

        /*
        1.

        Instantiated a subclass of collection: ArrayList

        We use our List interface as Datatype here.

        We hold person objects in this list
         */
        List<Person> listOfPersons = new ArrayList<>();

        /*
        2.

        We can add them like so:
         */
        listOfPersons.add(new Person("Alex","Keisse",28,92,1.89));
        listOfPersons.add(new Person("Bart","Dromer",28,65,1.81));
        listOfPersons.add(new Person("Patrick","Worker",36,88,1.77));
        listOfPersons.add(new Person("Wouter","Historian",36,80,1.86));

        /*
        3.

        Or even like this:
         */
        listOfPersons.add(0, new Person("Last", "Person",80,55,1.70));
        //Duplicate is also possible in ArrayList
        listOfPersons.add((listOfPersons.size()), new Person("Last", "Person",80,55,1.70));

        /*
        4.

        We print them out using the forEach method => using lambda
         */
        listOfPersons.forEach(System.out::println);

        /*
        5.

        We print out the size and clear our list
         */
//        System.out.println(listOfPersons.size() + ": persons in list");
//        listOfPersons.clear();

        /*
        6.

        We print out the size again
         */
//        System.out.println(listOfPersons.size() + ": persons in list");

        /*
        7.

        We can take out the last object of our list using a specified index
         */
//        System.out.println(listOfPersons.get(listOfPersons.size() -1));

        /*
        8.

        We convert now are ArrayList to LinkedList
        by giving it to the constructor.
         */
        List<Person> secListOfPeople = new LinkedList<>(listOfPersons);


    }


}
