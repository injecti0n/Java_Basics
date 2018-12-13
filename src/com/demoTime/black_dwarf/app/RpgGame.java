package com.demoTime.black_dwarf.app;

import com.demoTime.black_dwarf.characters.impl.Rogue;
import com.demoTime.black_dwarf.characters.impl.Spelluser;
import com.demoTime.black_dwarf.characters.impl.Warrior;
import com.demoTime.black_dwarf.equipment.impl.Boots;
import com.demoTime.black_dwarf.equipment.impl.Chest;
import com.demoTime.black_dwarf.equipment.impl.Helmet;
import com.demoTime.black_dwarf.equipment.impl.Pants;
import com.demoTime.black_dwarf.persistence.PlayerBase;

public class RpgGame {

    public static void main(String[] args) {

        boolean dummy = true;

        Warrior alex = new Warrior("Alex", "");
        Spelluser bart = new Spelluser("Bart", "");
        Rogue wouter = new Rogue("Wouter", "");

        Helmet helmet = new Helmet(!dummy);
        Pants pants = new Pants(!dummy);
        Boots boots = new Boots(!dummy);
        Chest chest = new Chest(!dummy);

        alex.equip(helmet);
        alex.equip(pants);
        alex.equip(chest);
        alex.equip(boots);

        alex.unequip(helmet);
        alex.unequip(pants);
        alex.unequip(chest);
        alex.unequip(boots);


        PlayerBase base = new PlayerBase();
        base.setTeam(alex);
        base.setTeam(bart);
        base.setTeam(wouter);

        base.storeEquipment(helmet);
        base.storeEquipment(chest);
        base.storeEquipment(pants);
        base.storeEquipment(boots);

        System.out.println(base);


    }
}
