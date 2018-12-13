package com.demoTime.collections.sortingWarehouse;

import com.demoTime.collections.sortingWarehouse.interfaces.IdChecker;

import java.util.Comparator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Warehouse {

    /*
    Fields that represent different warehouses

    And every warehouse does things different
     */
    private SortedSet<Box> warehouseHuys;
    private SortedSet<Box> warehouseTheApthorp;
    private SortedSet<Box> warehouseIronWood;
    private SortedSet<Box> warehouseEarth2;

    /*
    no arg constructor

    creating the warehouses, every time books show a way add a warehouse
    and use the way of the book to sort...

    Then filling them with private helper method.
     */
    public Warehouse() {
        /*
        Using a comparator obj to sort list.
         */
        warehouseEarth2 = new TreeSet<>(new IdChecker());

        /*
        Using a anonymous class to make a comparator obj to sort list.
         */
        warehouseIronWood = new TreeSet<>(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getWidth() - o2.getWidth();
            }
        });

        /*
        Comparator is a functional interface so we can use
        a lambda expression here.
         */
        warehouseHuys = new TreeSet<>((o1, o2) -> o1.getLength() - o2.getLength());

        /*
        Using the Interface Comparator with
        static method comparingInt

        In this we fill a Lambda expression using method reference
         */
        warehouseTheApthorp = new TreeSet<>(Comparator.comparingInt(Box::getHeight));

        /*
        Fill up the list boiiiii
         */
        feedTheWareHouse(50);
    }

    /*
    Only getters needed.
     */
    public SortedSet<Box> getWarehouseHuys() {
        return warehouseHuys;
    }

    public SortedSet<Box> getWarehouseTheApthorp() {
        return warehouseTheApthorp;
    }

    public SortedSet<Box> getWarehouseIronWood() {
        return warehouseIronWood;
    }

    public SortedSet<Box> getWarehouseEarth2() {
        return warehouseEarth2;
    }

    /*
    Private helper method to fill up list of boxes,
    this happens with the help of random
     */
    private void feedTheWareHouse(int quantity) {

        Random random = new Random();
        final int bound = 10;

        for (int i = 0; i <= quantity; i++) {
            warehouseHuys.add(new Box(i * random.nextInt(bound), i * random.nextInt(bound),
                    i * random.nextInt(bound)));

            warehouseEarth2.add(new Box(i * random.nextInt(bound),i * random.nextInt(bound),
                    i * random.nextInt(bound)));

            warehouseIronWood.add(new Box(i * random.nextInt(bound), i * random.nextInt(bound),
                    i * random.nextInt(bound)));

            warehouseTheApthorp.add(new Box(i * random.nextInt(bound), i * random.nextInt(bound),
                    i * random.nextInt(bound)));
        }
    }


    public static void main(String[] args) {

        /*
        Making obj of the warehouse that holds the boxes
         */
        Warehouse plant = new Warehouse();

        /*
        Iteration of the different warehouses
         */
        System.out.println("Sorted according to length boxes\n\n");
        plant.getWarehouseHuys().forEach(System.out::println);
        System.out.println("\n\n");

        System.out.println("Sorted according to widths box\n\n");
        plant.getWarehouseIronWood().forEach(System.out::println);
        System.out.println("\n\n");

        System.out.println("Sorted according to height boxes\n\n");
        plant.getWarehouseTheApthorp().forEach(System.out::println);
        System.out.println("\n\n");

        System.out.println("Sorted according to id\n\n");
        plant.getWarehouseEarth2().forEach(System.out::println);
        System.out.println("\n\n");
    }
}
