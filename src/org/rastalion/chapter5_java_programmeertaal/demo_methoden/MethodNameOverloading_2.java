package org.rastalion.chapter5_java_programmeertaal.demo_methoden;

/*
Purpose of this program is to search for the lesser of 2 values
and show that if we change the param list there is method name overloading
 */

public class MethodNameOverloading_2 {
    public static void main (String[] args) {

        int a = 11;
        int b = 6;
        int result1 = minFunction(a, b);

//        double c = 7.3;
//        double d = 9.4;
//        // same function name with different parameters
//        double result2 = minFunction(c, d);

        System.out.println("Minimum Value = " + result1);
//        System.out.println("Minimum Value = " + result2);
    }

    // for integer
    private static int minFunction (int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    // for double
    private static double minFunction (double n1, double n2) {
        return (n1 > n2) ? n2 : n1;
    }
}
