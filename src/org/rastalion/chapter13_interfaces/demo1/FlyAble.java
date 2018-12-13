package org.rastalion.chapter13_interfaces.demo1;

/**
 * Created by Mrrobot on 9/05/2018 javabasics-workspace.
 * <p>
 * <p>
 * second
 */
public interface FlyAble {

    public abstract void fly (int speed);

    public abstract void takeOff ();

    public abstract double dive ();
    /*
    Same as the CanFly interface but
    instead of letting the compiler
    put public abstract we did it ourself.
    is considered good behaviour.
     */

}
