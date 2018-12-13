package be.intecbrussel.alexander_oplossingen.ForestBook.service;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.Animal;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Carnivore;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Herbivore;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Omnivore;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class ForestNotebook {

    /*
    Fields
     */
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;

    private int plantCount;
    private int animalCount;

    private List<Animal> animals;
    private List<Plant> plants;

    /*
    Constructor

    using all fields except plantCount, animalCount
     */
    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }

    /*
    Getters and Setters

    For all the fields except: animals, plants.
     */
    public List<Carnivore> getCarnivores () {
        return carnivores;
    }

    public void setCarnivores (List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores () {
        return omnivores;
    }

    public void setOmnivores (List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores () {
        return herbivores;
    }

    public void setHerbivores (List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount () {
        return plantCount;
    }

    public int getAnimalCount () {
        return animalCount;
    }

    /*
    Added methods
     */
    public void addAnimal(Animal animal) {
        if (animal != null) {
            //private helper method to add to internal list
            addToRightList(animal);
            if (this.animals.indexOf(animal) == -1){
                animals.add(animal);
                animalCount = animals.size();
            }
        }

    }

    private void addToRightList (Animal animal) {
        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        } else if (animal instanceof Herbivore){
            herbivores.add((Herbivore) animal);
        }else if (animal instanceof  Omnivore){
            omnivores.add((Omnivore) animal);
        }
    }

    public void addPlant(Plant plant) {
        if (plant != null) {
            if (this.plants.indexOf(plant) == -1) {
                this.plants.add(plant);
                plantCount = plants.size();
            }
        }
    }

    public void printNotebook() {
        System.out.println("\nList of all the Animals:\n");
        animals.forEach(System.out::println);
        System.out.println("\nList of all the Plants:\n");
        plants.forEach(System.out::println);
    }

    /*
    Sort methods
     */
    public void sortAnimalsByName() {
        this.animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName() {
        this.plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight() {
        this.animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        this.plants.sort(Comparator.comparing(Plant::getHeight));
    }


}
