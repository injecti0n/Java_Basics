package com.demoTime.collections.sortingWarehouse;

public class Box implements Comparable<Box> {

    /*
    Fields describing a box
     */
    private int width;
    private int length;
    private int height;
    private int id;

    private static int boxCounter;

    /*
    No args Constructor
     */
    public Box() {
        this.id = boxCounter++;
    }

    /*
    Constructor with all fields
     */
    public Box(int width, int length, int height) {
        this.width = checkNegativeValues(width);
        this.length = checkNegativeValues(length);
        this.height = checkNegativeValues(height);
        this.id = boxCounter++;
    }

    /*
    Getters & Setters
     */

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }



    /*
    Private helper method
    To check for negative values
     */

    private int checkNegativeValues(int value) {
        return value < 0 ? value * -1 : value;
    }
    /*
    Private helper method
    To calculate the volume of this
    given box.
     */

    private int getVolume() {
        return width * length * height;
    }


    /*
    We will need to give this Overwritten
    compareTo Method a new sorting Algorithm
    */
    @Override
    public int compareTo(Box other) {
        return getVolume() - other.getVolume();
    }

    /*
    ToString new impl
     */
    @Override
    public String toString() {
        return "Box:\t" +
                "\twidth=" + width +
                "\tlength=" + length +
                "\theight=" + height +
                "\tid='" + id + '\'' +
                '\n';
    }
}
