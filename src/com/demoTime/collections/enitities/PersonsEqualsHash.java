package com.demoTime.collections.enitities;

import java.util.Objects;

/**
 * Created by Mrrobot on 23/05/2018 javabasics-workspace.
 */
public class PersonsEqualsHash {

    private String name;
    private String surname;

    private int age;
    private double weight;
    private double height;

    public PersonsEqualsHash (String name, String surname, int age, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
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

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonsEqualsHash that = (PersonsEqualsHash) o;
        return getAge() == that.getAge() &&
                Double.compare(that.getWeight(), getWeight()) == 0 &&
                Double.compare(that.getHeight(), getHeight()) == 0 &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSurname(), that.getSurname());
    }

    @Override
    public int hashCode () {
        return Objects.hash(getName(), getSurname(), getAge(), getWeight(), getHeight());
    }
}
