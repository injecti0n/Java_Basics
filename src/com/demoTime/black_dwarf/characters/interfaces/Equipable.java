package com.demoTime.black_dwarf.characters.interfaces;

import com.demoTime.black_dwarf.equipment.interfaces.Wearable;

public interface Equipable {

    public abstract void equip(Wearable wearable);

    public abstract void unequip(Wearable wearable);

}
