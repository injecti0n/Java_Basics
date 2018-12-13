package be.intecbrussel.alexander_oplossingen.ForestBook.app;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Carnivore;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Herbivore;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Omnivore;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.Plant;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.Bush;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.Flower;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.Tree;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.Weed;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.enums.LeafType;
import be.intecbrussel.alexander_oplossingen.ForestBook.entities.plant_entities.impl.enums.Scent;
import be.intecbrussel.alexander_oplossingen.ForestBook.service.ForestNotebook;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mrrobot on 29/05/2018 javabasics-workspace.
 */
public class NatureApp {

    public static void main (String[] args) {

        /*
        Aaah making myself a forest book aye mate
         */
        ForestNotebook notebook = new ForestNotebook();

        /*
        Creating the plants
         */
        Tree loneCypress = new Tree("Lone Cypress", 3.4);
        loneCypress.setLeafType(LeafType.HAND);

        Bush tinyWine = new Bush("Tiny Wine", 0.75);
        tinyWine.setLeafType(LeafType.NEEDLE);
        tinyWine.setFruit("tiny rick");

        Bush pinkDelight = new Bush("Pink Delight", 1.2);
        pinkDelight.setLeafType(LeafType.SPEAR);
        pinkDelight.setFruit("Delight");

        Flower rose = new Flower("Rose", 0.3);
        rose.setSmell(Scent.EARTHY);

        Weed haze = new Weed("Haze", 0.42);
        haze.setArea(4.2);

        /*
        Adding the created Plant obj to plantList
         */
        notebook.addPlant(loneCypress);
        notebook.addPlant(tinyWine);
        notebook.addPlant(pinkDelight);
        notebook.addPlant(rose);
        notebook.addPlant(haze);

        /*
        Making a local dietList for the plant eating animals
         */
        Set<Plant> dietList = new HashSet<>();
        dietList.add(haze);
        dietList.add(tinyWine);
        dietList.add(pinkDelight);

        /*
        Creating the animals
         */
        Carnivore animal1 = new Carnivore("Tiger", 52, 0.8, 1);
        animal1.setMaxFoodSize(1);

        Carnivore animal2 = new Carnivore("Lion", 48, 0.8,1.1);
        animal2.setMaxFoodSize(1);

        Herbivore animal3 = new Herbivore("Antelope", 15, 1.3,1.2);
        animal3.setPlantDiet(dietList);

        Omnivore animal4 = new Omnivore("Raccoon", 2,0.3,0.3);
        animal4.setMaxFoodSize(0.08);
        animal4.setPlantDiet(dietList);

        Omnivore animal5 = new Omnivore("Squirrel", 1.4,0.2,0.2);
        animal5.setMaxFoodSize(0.04);
        animal5.setPlantDiet(dietList);

        Carnivore animal6 = new Carnivore("Hawk", 4,0.4,1.4);
        animal6.setMaxFoodSize(0.4);

        Omnivore animal7 = new Omnivore("Human", 72,1.78, 1.78);
        animal7.setMaxFoodSize(2);
        animal7.setPlantDiet(dietList);

        Carnivore animal8 = new Carnivore("Fox", 7,0.42,0.89);
        animal8.setMaxFoodSize(0.2);

        Omnivore animal9 = new Omnivore("Chicken", 1,0.32,0.32);
        animal9.setMaxFoodSize(0.14);
        animal9.setPlantDiet(dietList);

        /*
        Adding the created Animal obj to animalList
         */
        notebook.addAnimal(animal1);
        notebook.addAnimal(animal2);
        notebook.addAnimal(animal3);
        notebook.addAnimal(animal4);
        notebook.addAnimal(animal5);
        notebook.addAnimal(animal6);
        notebook.addAnimal(animal7);
        notebook.addAnimal(animal8);
        notebook.addAnimal(animal9);

        /*
        Plant sizes of the different list
         */
        System.out.println("Size of list plants: " + notebook.getPlantCount());
        System.out.println("Size of list animals: " + notebook.getAnimalCount());

        System.out.println("\n\n");

        /*
        Unsorted print out individual list type Animals:

        Omnivore,
        Herbivore,
        Carnivore
         */
        printGivenList("Unsorted List Herbivores", notebook.getHerbivores());
        printGivenList("Unsorted List Omnivores", notebook.getOmnivores());
        printGivenList("Unsorted List Carnivores", notebook.getCarnivores());

        /*
        Unsorted print out of the Plant list and Animal list
         */
        notebook.printNotebook();

        System.out.println("\nNow sorted by Name");
        notebook.sortAnimalsByName();
        notebook.sortPlantsByName();
//        notebook.sortAnimalsByHeight();
//        notebook.sortPlantsByHeight();
        notebook.printNotebook();

    }

    private static void printGivenList (String listToPrint, List<?> list) {
        System.out.printf("\n%s:\n", listToPrint);
        list.forEach(System.out::println);
    }

}
