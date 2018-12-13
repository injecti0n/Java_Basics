package org.rastalion.chapter13_interfaces.demo3;

/**
 * Created by Mrrobot on 9/05/2018 javabasics-workspace.
 */
public class LeopardSeal extends HarborSeal {

    /*
    These methods must be implemented.
    if not you have a compile error.
     */
    @Override
    public int getTailLength () {
        return tailLength;
    }

    @Override
    public int getNumberOfWhiskers () {
        return numbOfWhiskers;
    }
}
