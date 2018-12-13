package org.rastalion.chapter11_enum.demo1;

public class EnumApp {

    public static void main (String[] args) {

        Color color = Color.BLACK;
        Color color1 = Color.GREEN;

        System.out.println("Name of the instance " + color.name());
        System.out.println("Ordinal of the subclass: " + color.ordinal());


        System.out.println("ToString() :: " + color);
        System.out.println("ToString() :: " + color1);

    }

}
