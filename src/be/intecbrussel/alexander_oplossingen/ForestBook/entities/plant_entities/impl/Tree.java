package be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.enums.LeafType;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Tree extends Plant {

    /*
    name, height inherited from Plant

    Fields describing Tree
     */
    private LeafType leafType;

    /*
    Constructors matching super
     */
    public Tree (String name) {
        super(name);
    }

    public Tree (String name, double height) {
        super(name, height);
    }

    /*
    Getter and Setter
     */
    public LeafType getLeafType () {
        return leafType;
    }

    public void setLeafType (LeafType leafType) {
        this.leafType = leafType;
    }

    /*
    Overwritten methods
     */

    @Override
    public String toString () {
        return name + " is a Three type of plant. It's leaftype is: " + leafType +
                ". The plant is : " + height + "m tall.";
    }
}
