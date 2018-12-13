package org.rastalion.chapter13_interfaces.demo4;

/**
 * Created by Mrrobot on 9/05/2018 javabasics-workspace.
 */
public class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants () {
        System.out.println("Eating plants.");
    }

    @Override
    public void eatMeat () {
        System.out.println("Eating meat.");
    }
}
