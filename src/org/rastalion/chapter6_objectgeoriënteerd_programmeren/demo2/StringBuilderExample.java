package org.rastalion.chapter6_objectgeoriënteerd_programmeren.demo2;

public class StringBuilderExample {

    public static void main (String[] args) {

        StringBuilder sentence = new StringBuilder("");
        //They will share the same obj ref
        StringBuilder copy = sentence;

        //this then will also change coppy
        sentence.append("This ").append("is ").append("method ").append("chaining!");
        System.out.println(copy);

        //in return this will affect the sentence obj
        copy.deleteCharAt(copy.length() - 1);
        System.out.println(sentence);


    }

}
