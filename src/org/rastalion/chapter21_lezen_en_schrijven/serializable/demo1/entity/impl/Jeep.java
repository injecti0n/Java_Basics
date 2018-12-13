package org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1.entity.impl;

import org.rastalion.chapter21_lezen_en_schrijven.serializable.demo1.entity.Car;

/**
 * Created by Mrrobot on 5/06/2018 javabasics-workspace.
 */
public class Jeep extends Car {

    private boolean bullBar = true;

    public Jeep (String brand, double weight, double height, boolean bullBar) {
        super(brand, weight, height);
        this.bullBar = bullBar;
    }

    @Override
    public String toString () {
        return "Jeep{" +
                "bullBar=" + bullBar +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
