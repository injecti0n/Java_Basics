package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1.entity;

import be.intecbrussel.alexander_oplossingen.ForestBook.entities.animal_entities.impl.Omnivore;

import java.io.Serializable;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */

//only implement after exception is thrown
public class Car implements Serializable {

    private final static int NUMB_WHEELS = 4;

    protected String brand;
    protected double weight;
    protected double height;

    private Omnivore omnivore = new Omnivore("name");

    public Car (String brand, double weight, double height) {
        this.brand = brand;
        this.weight = checkNegVal(weight);
        this.height = checkNegVal(height);
    }

    public static int getNumbWheels () {
        return NUMB_WHEELS;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
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

    private double checkNegVal (double value) {
        return value < 0 ? -value : value;
    }

    @Override
    public String toString () {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", omnivore=" + omnivore +
                '}';
    }
}
