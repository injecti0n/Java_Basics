package com.demoTime.black_dwarf.equipment.impl;

import com.demoTime.black_dwarf.equipment.interfaces.Wearable;

public class Pants implements Wearable {

    private int armorValue;

    public Pants(boolean dummy) {
        if (dummy) {
            this.armorValue = 0;
        } else {
            setArmorValue();
        }
    }

    @Override
    public int getArmorValue() {
        return armorValue;
    }

    @Override
    public void setArmorValue() {
        this.armorValue = dice.throwDice(3);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "armorValue=" + armorValue +
                '}';
    }
}
