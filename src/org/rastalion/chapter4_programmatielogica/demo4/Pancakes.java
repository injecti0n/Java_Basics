package org.rastalion.chapter4_programmatielogica.demo4;

public class Pancakes {

    public static void main (String[] args) {

        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix ingredients");
        System.out.println("Start baking: ");
        for (int count = 1; count <= 10; count++) {
            System.out.println("Bake pancake " + count);
        }
    }

}
