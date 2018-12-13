package org.rastalion.chapter5_java_programmeertaal.demo4;

public class FlowStatements {

    public static void main (String[] args) {

        boolean condition = false;                 //voorbeeld code
        int counter = 0;                         //code zal minstens 1 keer worden uitgevoerd

        do {
            counter++;
            if (counter == 20) {
                condition = true;
            }
            System.out.println(condition);
        } while (!condition);


    }

}
