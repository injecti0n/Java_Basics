package com.demoTime.collections.List.demo3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Mrrobot on 23/05/2018 javabasics-workspace.
 */
public class IntInIntegerListApp {

    public static void main (String[] args) {

        /*
        Generate a list using an IntStream
         */
        List<Integer> listOfNumbs = IntStream.rangeClosed(0,25)
                                                .boxed()
                                                .collect(Collectors.toList());

        /*
        Using the foreach to print them out
         */
//        listOfNumbs.forEach(System.out::println);

        /*
        Adding some Integer values to Integer List
         */
        listOfNumbs.add(new Integer(26));

        /*
        Thanks to autoboxing this is also possible
         */
        int intValue = 27;
        listOfNumbs.add(intValue);

         /*
        Using the foreach to print them out
         */
//        listOfNumbs.forEach(System.out::println);

        /*
        Converting them back to Integer Array
         */
        Integer[] na = listOfNumbs.toArray(new Integer[listOfNumbs.size()]);
        //Second way to do this, will this work?
        Integer[] na2 = listOfNumbs.toArray(new Integer[0]);

        for (Integer i: na) {
            System.out.println(i);
        }
    }

}
