package org.rastalion.chapter6_objectgeoriënteerd_programmeren.methodOverloading;

public class PolyDemo {

    public static void main (String[] args) {

        OverloadSample obj = new OverloadSample();

        //Java gaat zelf op zoek naar de juiste methode!!
        obj.print(10);
        obj.print("Alex");
        obj.print("Alex", 42);


    }

}
