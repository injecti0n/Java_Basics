package org.rastalion.chapter6_objectgeoriënteerd_programmeren.encapsulation;

/**
 * Created by Mrrobot on 30/03/2018 javaBasics.
 */
public class Mobile {
    /*
    Properties of our object
     */
    protected String manufacturer;
    protected String operatingSystem;
    protected String model;
    protected int cost;

    /*
    Constructor
     */
    public Mobile (String manufacturer, String operatingSystem, String model, int cost) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.cost = cost;
    }

    /*
    Getters & Setters
     */
    public String getManufacturer () {
        return manufacturer;
    }

    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem () {
        return operatingSystem;
    }

    public void setOperatingSystem (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public int getCost () {
        return cost;
    }

    public void setCost (int cost) {
        this.cost = cost;
    }

    public void ringMobile () {
        System.out.println("This is a mobile ringing");
    }

    /*
    ToString that is overwritten.
     */
    @Override
    public String toString () {
        return "Mobile{" +
                "manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
