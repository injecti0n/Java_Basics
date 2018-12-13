package org.rastalion.chapter5_java_programmeertaal.demo_methoden;

public class VoidExample_3 {

    public static void main (String[] args) {
        methodRankPoints(10);
    }

    public static void methodRankPoints (double points) {
        if (points > 8) {
            System.out.println("Excellent");
        } else if (points > 5) {
            System.out.println("You passed");
        } else {
            System.out.println("You done goofed?");
        }
    }

}
