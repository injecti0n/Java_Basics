package com.demoTime.black_dwarf.characters.impl;

import com.demoTime.black_dwarf.characters.Adventurers;
import com.demoTime.black_dwarf.equipment.Weapons;

public class Spelluser extends Adventurers {

    public Spelluser(String name, String backgroundStory) {
        super(name, backgroundStory);
        setIntelligence(2);
        bag[0] = Weapons.WIZZARD_STAFF;
    }

    protected void setIntelligence(int diceThrows) {
        super.intelligence = dice.throwDice(diceThrows) + 6;
    }

    @Override
    public String toString() {
        return "Spelluser{" +
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

        Spelluser mage = new Spelluser("Alex", "");
        System.out.println(mage);

    }

}
