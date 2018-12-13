package com.demoTime.collections.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Mrrobot on 23/05/2018 javabasics-workspace.
 */
public class TreeSetApp {

    public static void main (String[] args) {

        SortedSet<Integer> numbers = new TreeSet<>();
        NavigableSet<Integer> copy = new TreeSet<>(numbers);

        numbers.add(4);
        numbers.add(8);
        numbers.add(3);
        numbers.forEach(System.out::println);
        System.out.println();

        numbers.add(5);
        numbers.forEach(System.out::println);
        System.out.println();
//
        numbers.remove(4);
        numbers.forEach(System.out::println);
        System.out.println();
//
        System.out.println("First element in TreeSet: " + numbers.first());
        System.out.println("Last element in TreeSet: " + numbers.last());
        System.out.println("Closest element in TreeSet higher then 7: " + copy.ceiling(7));
        System.out.println("Closest element in TreeSet lower then 7: " + copy.floor(7));
        System.out.println("Element following element 5 in our TreeSet: " + copy.higher(5));
        System.out.println("Element before element 5 in our TreeSet: " + copy.lower(5));

    }

}
