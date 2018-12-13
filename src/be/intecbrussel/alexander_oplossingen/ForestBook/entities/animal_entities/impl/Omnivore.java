package be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl;


import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.Animal;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;

import java.util.*;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Omnivore extends Animal {

    /*
    Inherits fields from Animal

    Fields describing omnivore,
    and for holding a List of eatable plants
     */
    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    /*
    Constructors matching super
     */
    public Omnivore (String name) {
        super(name);
    }

    public Omnivore (String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    /*
    Getters and Setters
     */
    public Set<Plant> getPlantDiet () {
        return plantDiet;
    }

    public void setPlantDiet (Set<Plant> plantDiet) {
        if (plantDiet != null) {
            this.plantDiet = plantDiet;
        }
    }

    public double getMaxFoodSize () {
        return maxFoodSize;
    }

    public void setMaxFoodSize (double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    /*
    Methods added by this class
     */
    public void addPlantToDiet(Plant plant) {
        //Check for null before adding [good practice!]
        if (plant != null && !plantDiet.contains(plant)) {
            plantDiet.add(plant);
        }
    }

    /*
    Overwritten Methods
     */
    @Override
    public String toString () {
        return name + " is a Omnivore. it has a height of " + height +
                " m, weighs about " + weight + " kg. The maximum height of it's prey is "
                + maxFoodSize + "m. It also eats the following plants: "
                + plantDiet;
    }
}
