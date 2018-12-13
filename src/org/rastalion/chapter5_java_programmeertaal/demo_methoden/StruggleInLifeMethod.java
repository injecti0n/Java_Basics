package org.rastalion.chapter5_java_programmeertaal.demo_methoden;

import java.util.Random;

/**
 * Created by Mrrobot on 28/03/2018 javaBasics.
 */
public class StruggleInLifeMethod {

    public static void main (String[] args) {

        ochtendRoutine("Alexander", "Sarah");
        transport("Landegem", "Brussel Zuid");
        werkRoutine(8, 17);
        transport("Brussel Zuid", "Landegem");
        avondRoutine("pizza", false, false);

    }

    private static void ochtendRoutine (String userName, String vervangMama) {
        printThemLines(50, "ochtendRoutine");
        System.out.println("Get up " + userName + " your clock keeps going off");
        System.out.println("Make up your bed or " + vervangMama + " will be mad :(");
        System.out.println("Breakfast, most important meal of the day");
        System.out.println("brush your teeth, nobody wants to smell!");
    }

    private static void werkRoutine (int startHour, int endHour) {
        printThemLines(50, "werkRoutine");
        System.out.println(startHour + "H, time to begin the workday");
        System.out.println("Break");
        System.out.println(endHour + "H, time to go home.\nFree at last!!");
    }

    private static void avondRoutine (String food, boolean timeForRelaxing, boolean willSleep) {
//        printThemLines(50,"avondRoutine");
        System.out.println("Today we eat: " + food);
        String eveningActivity = (timeForRelaxing) ? "Time to relax now" : "Work is fun, now work more...";
        System.out.println(eveningActivity);
        String sleepTonight = willSleep ? "Ok, you earned it.\nYou can go to sleep" : "Who needs sleep if you can work";
        System.out.println(sleepTonight);
    }

    private static void transport (String startPoint, String endPoint) {
        Random random = new Random();
        printThemLines(50, "transPort");
        System.out.println("You are on your way from " + startPoint
                + " and are taking the train to " + endPoint);

        System.out.println("Sorry but you will be "
                + (random.nextInt(30) + 1) + " minutes late.");

        System.out.println("You have arrived in: " + endPoint);
    }

    private static void printThemLines (int lines, String message) {
        System.out.println('\n' + message + '\n');
        for (int i = 0; i <= lines; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}
