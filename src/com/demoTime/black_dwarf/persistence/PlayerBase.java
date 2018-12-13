package com.demoTime.black_dwarf.persistence;

import com.demoTime.black_dwarf.characters.Adventurers;
import com.demoTime.black_dwarf.equipment.interfaces.Wearable;

import java.util.ArrayList;
import java.util.List;

public class PlayerBase {

    List<Adventurers> team = new ArrayList<>();
    List<Wearable> equipmentChest = new ArrayList<>();

    public void setTeam(Adventurers teamMember) {
        if (teamMember != null && team.size() < 4) {
            team.add(teamMember);
        } else {
            System.out.println("Something went wrong");
        }
    }

    public void storeEquipment(Wearable wearable) {
        if (wearable != null) {
            equipmentChest.add(wearable);
        }
    }

    @Override
    public String toString() {
        return "PlayerBase{" +
                "team=" + team.toString() +
                ", equipmentChest=" + equipmentChest.toString() +
                '}';
    }
}
