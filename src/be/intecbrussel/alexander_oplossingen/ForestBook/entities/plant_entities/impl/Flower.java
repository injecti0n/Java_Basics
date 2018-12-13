package be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.enums.Scent;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Flower extends Plant {

    /*
    fields inherited from plant: name, height

    Extra field smell
     */
    private Scent smell;

    /*
    Constructors matching SuperClass
     */
    public Flower (String name) {
        super(name);
    }

    public Flower (String name, double height) {
        super(name, height);
    }

    /*
    Getters and Setters
     */
    public Scent getSmell () {
        return smell;
    }

    public void setSmell (Scent smell) {
        this.smell = smell;
    }

    /*
    Overwritten methods
     */

    @Override
    public String toString () {
        return name + " is a flower type of plant. It's smell is: " + smell +
                ". The plant is : " + height + "m tall.";
    }
}
