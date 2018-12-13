package be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.Animal;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Carnivore extends Animal {

    /*
    Inherits fields from Animal

    Fields describing carnivore
     */
    private double maxFoodSize;

    /*
    Constructors matching super
     */
    public Carnivore (String name) {
        super(name);
    }

    public Carnivore (String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    /*
    Getters and Setters
     */
    public double getMaxFoodSize () {
        return maxFoodSize;
    }

    public void setMaxFoodSize (double maxFoodSize) {
        this.maxFoodSize = checkNegVal(maxFoodSize);
    }

    /*
    Overwritten methods
     */

    @Override
    public String toString () {
        return name + " is a Carnivore. it has a height of " + height +
                " m, weighs about " + weight + " kg. The maximum height of it's prey is "
                + maxFoodSize + "m.";
    }
}
