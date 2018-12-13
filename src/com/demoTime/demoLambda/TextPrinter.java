package com.demoTime.demoLambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Mrrobot on 17/05/2018 javabasics-workspace.
 */
public class TextPrinter {

    private String sentence;

    public TextPrinter (String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords (Predicate<String> filter, Consumer<String> consumer) {
        for (String w : sentence.split(" ")) {
            if (filter.test(w))
            consumer.accept(w); //sysout veranderen naar dit
        }

    }

    public void printProcessedWords (WordProcessor processor) {
        for (String w : sentence.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    public void printNumbValues (NumberParser parser) {
        for (String w : sentence.split(" ")) {
            System.out.format("%,d%n", parser.parse(w));
        }
    }
}
