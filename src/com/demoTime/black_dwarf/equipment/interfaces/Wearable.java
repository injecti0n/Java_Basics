package com.demoTime.black_dwarf.equipment.interfaces;


import com.demoTime.black_dwarf.util.Dice;

public interface Wearable {

    Dice dice = new Dice();

    int getArmorValue();

    void setArmorValue();


}
