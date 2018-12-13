package com.demoTime.collections.List.demo1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Mrrobot on 23/05/2018 javabasics-workspace.
 */
public class IteratorApp {

    public static void main (String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Hello could you please fill in some nonsense?");
        String userInput = kbd.nextLine();

        /*
        Add this time do not worry about underneath code.
         */
        Collection<String> listOfChars = Stream.of(userInput.split("")).collect(Collectors.toList());

        /*
        Because we know have a Collection object we can get an iterator

        first like this
         */
        Iterator<String> it = listOfChars.iterator();

        /*
        And the it.hasnext is very usefull as a boolean flag
         */
//        while (it.hasNext()) {
//            /*
//            While our collection still holds some chars we print them out.
//             */
//            System.out.println(it.next());
//        }

        /*
        Second way to iterate
         */
//        for (String s: listOfChars) {
//            System.out.println(s);
//        }

        /*
        Third way
         */
//        listOfChars.forEach(System.out::println);

        /*
        Fourth way
         */
//        listOfChars.stream()
//                    .limit(5)
//                    .forEach(System.out::println);

    }

}
