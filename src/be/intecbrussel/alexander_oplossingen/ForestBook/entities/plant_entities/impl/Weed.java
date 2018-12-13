package be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Weed extends Plant {

    /*
    name, height inherited from Plant

    Fields describing Weed
     */
    private double area;

    /*
    name, height inherited from Plant

    Fields describing Tree
     */
    public Weed (String name) {
        super(name);
    }

    public Weed (String name, double height) {
        super(name, height);
    }

    /*
    Getters and Setters
     */
    public double getArea () {
        return area;
    }

    public void setArea (double area) {
        this.area = checkNegVal(area);
    }

    /*
    Overwritten methods
     */

    @Override
    public String toString () {
        return name + " is a weed type of plant. The plant is : " +
                height + "m tall. And has a area of: " + area + "m.";
    }
}
