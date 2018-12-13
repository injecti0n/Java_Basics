package be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.Animal;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class Herbivore extends Animal {

    /*
    Inherits fields from animal

    adds field for holding list of Eatable plants
     */
    private Set<Plant> plantDiet = new HashSet<>();

    /*
    Constructors matching super
     */
    public Herbivore (String name) {
        super(name);
    }

    public Herbivore (String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    /*
    Getters and Setters
     */
    public Set<Plant> getPlantDiet () {
        return plantDiet;
    }

    public void setPlantDiet (Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
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

    public void printDiet(){
        plantDiet.forEach(System.out::println);
    }

    /*
    Overwritten methods
     */
    @Override
    public String toString () {
        return name + " is a Herbivore. it has a height of " + height +
                " m, weighs about " + weight + " kg. It eats following plants "
                + plantDiet;
    }
}
