package be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.enums.LeafType;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Bush extends Plant {

    /*
    name, height inherited from Plant

    Fields describing Bush
     */
    private String fruit;
    private LeafType leafType;

    /*
    Constructor: name
     */
    public Bush(String name) {
        super(name);
    }

    /*
    Constructor:  name, height
     */
    public Bush(String name, double height) {
        super(name, height);
    }

    /*
    Getters and Setters
     */
    public String getFruit () {
        return fruit;
    }

    public void setFruit (String fruit) {
        this.fruit = fruit;
    }

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
        return name + " is a bush type of plant. It's leaftype is: " + leafType +
                    ", has the following fruit: " + fruit + ". The plant is : " +
                    height + "m tall.";
    }
}
