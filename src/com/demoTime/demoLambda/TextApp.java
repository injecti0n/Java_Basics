package com.demoTime.demoLambda;

/**
 * Created by Mrrobot on 17/05/2018 javabasics-workspace.
 */
public class TextApp {

    public static void main (String[] args) {

        TextPrinter tp = new TextPrinter("This is an example " +
                "of a sentence");

        tp.printFilteredWords(s -> s.contains("e"), System.out::println);
//
//        tp.printProcessedWords(s -> s.toUpperCase());

    }

}
