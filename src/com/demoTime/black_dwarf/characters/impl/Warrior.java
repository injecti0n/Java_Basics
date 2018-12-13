package com.demoTime.black_dwarf.characters.impl;

import com.demoTime.black_dwarf.characters.Adventurers;
import com.demoTime.black_dwarf.equipment.Weapons;

public class Warrior extends Adventurers {

    public Warrior(String name, String backgroundStory) {
        super(name, backgroundStory);
        setStrength(2);
        bag[0] = Weapons.BATTLE_AXE;
    }

    protected void setStrength(int diceThrows) {
        super.strength = dice.throwDice(diceThrows) + 6;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name=" + name +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", helmet=" + helmet +
                ", chest=" + chest +
                ", pants=" + pants +
                ", boots=" + boots +
                super.toString();
    }

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Alex", "");
        System.out.println(warrior);

    }

}
