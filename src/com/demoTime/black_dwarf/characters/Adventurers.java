package com.demoTime.black_dwarf.characters;

import com.demoTime.black_dwarf.characters.interfaces.Equipable;
import com.demoTime.black_dwarf.equipment.Weapons;
import com.demoTime.black_dwarf.equipment.impl.*;
import com.demoTime.black_dwarf.equipment.interfaces.Wearable;
import com.demoTime.black_dwarf.util.Dice;
import com.demoTime.black_dwarf.util.ValueChecker;

import java.util.Arrays;
import java.util.Scanner;

public class Adventurers implements Equipable {

    /*
    Personal info
     */
    protected String name;
    protected String backgroundStory;

    /*
    Adventurer skills
     */
    protected int strength;
    protected int agility;
    protected int intelligence;

    /*
    Armor variables
     */
    private int armorValue;

    protected Helmet helmet;
    protected Chest chest;
    protected Pants pants;
    protected Boots boots;
    protected Weapons[] bag = new Weapons[5];

    /*
    Private helper properties
     */
    protected Dice dice = new Dice();

    private boolean dummy = true;
    private ValueChecker checker = new ValueChecker();
    private Scanner kbd = new Scanner(System.in);

    public Adventurers(String name, String backgroundStory) {
        this.backgroundStory = backgroundStory;
        int diceThrows = 3;  //If you want to change starting skill change here
        setupCharacterDetails(name, diceThrows);
    }

    public void setName(String name) {
        if (checker.checkNullOrEmpty(name)) {
            this.name = name;
        } else {
            System.out.println("Please fill in a correct name: ");
            setName(kbd.nextLine());
        }
    }

    public void setBackgroundStory(String backgroundStory) {
        this.backgroundStory = backgroundStory;
    }

    protected void setStrength(int diceThrows) {
        this.strength = dice.throwDice(diceThrows);
    }

    protected void setAgility(int diceThrows) {
        this.agility = dice.throwDice(diceThrows);
    }

    protected void setIntelligence(int diceThrows) {
        this.intelligence = dice.throwDice(diceThrows);
    }


    /*
    Private helper methods
     */
    private void setupCharacterDetails(String name, int diceThrows) {
        setName(name);
        setStrength(diceThrows);
        setAgility(diceThrows);
        setIntelligence(diceThrows);
        equipCharacterArmor();
    }

    private void equipCharacterArmor() {
        helmet = new Helmet(!dummy);
        chest = new Chest(!dummy);
        pants = new Pants(!dummy);
        boots = new Boots(!dummy);
        this.armorValue = helmet.getArmorValue() + chest.getArmorValue()
                + pants.getArmorValue() + boots.getArmorValue();
    }

    private void switchGear(Wearable current, Wearable future) {
        this.armorValue -= current.getArmorValue();
        this.armorValue += future.getArmorValue();
    }

    @Override
    public void equip(Wearable wearable) {
        if (wearable != null) {
            if (wearable instanceof Helmet) {
                switchGear(this.helmet, helmet);
                helmet = (Helmet) wearable;
            } else if (wearable instanceof Chest) {
                switchGear(this.chest, chest);
                chest = (Chest) wearable;
            } else if (wearable instanceof Boots) {
                switchGear(this.boots, boots);
                boots = (Boots) wearable;
            } else if (wearable instanceof Pants) {
                switchGear(this.pants, pants);
                pants = (Pants) wearable;
            }
        } else {
            System.out.println("Not a wearable item!");
        }
    }

    @Override
    public void unequip(Wearable wearable) {
        if (wearable != null) {
            if (wearable instanceof Helmet) {
                Helmet replace = new Helmet(dummy);
                switchGear(helmet, replace);
                helmet = replace;
            } else if (wearable instanceof Chest) {
                Chest replace = new Chest(dummy);
                switchGear(chest, replace);
                chest = replace;
            } else if (wearable instanceof Boots) {
                Boots replace = new Boots(dummy);
                switchGear(boots, replace);
                boots = replace;
            } else if (wearable instanceof Pants) {
                Pants replace = new Pants(dummy);
                switchGear(pants, replace);
                pants = replace;
            }
        } else {
            System.out.println("Not a wearable item!");
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(bag) + "\ntotal armor:" + armorValue;
    }
}
