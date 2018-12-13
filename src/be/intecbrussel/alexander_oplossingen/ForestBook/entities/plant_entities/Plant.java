package be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Plant {

    /*
    Fields describing a Plant
     */
    protected String name;
    protected double height;


    /*
    Constructor: name
     */
    public Plant(String name) {
        this.name = name;
    }

    /*
    Constructor: name, height
     */
    public Plant(String name, double height) {
        this.name = name;
        this.height = checkNegVal(height);
    }

    /*
    Getters and Setters

    NO SETNAME METHOD
     */
    public String getName () {
        return name;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    /*
    Private helper method to check negative double values
     */
    protected double checkNegVal(double value) {
        return value < 0 ? -value:value;
    }
}
