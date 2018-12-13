package be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities;

import java.io.Serializable;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Animal implements Serializable {

    /*
    Fields describing animals
     */
    protected String name;
    protected double weight;
    protected double height;
    protected double length;

    /*
    Constructor param: name
     */
    public Animal (String name) {
        this.name = name;
    }

    /*
    Constructor using all fields
     */
    public Animal (String name, double weight, double height, double length) {
        this.name = name;
        this.weight = checkNegVal(weight);
        this.height = checkNegVal(height);
        this.length = checkNegVal(length);
    }

    /*
    Getters and Setters

    Beware no setter for name!!!
     */
    public String getName () {
        return name;
    }

    public double getWeight () {
        return weight;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double getLength () {
        return length;
    }

    public void setLength (double length) {
        this.length = length;
    }

    /*
    Protected helper method to check negative values
     */
    protected double checkNegVal(double value) {
        return value < 0 ? -value:value;
    }

}
