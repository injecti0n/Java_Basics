package com.demoTime.demoLambda;

/**
 * Created by Mrrobot on 18/05/2018 javabasics-workspace.
 */
public interface TextUtil {

    abstract void secondAbstr();

    abstract void aMethod();

    default void secondMethod() {
        System.out.println("Method");
    }

    public static String quote(String s) {
        return String.format("<<%s>>", s);
    }

}
