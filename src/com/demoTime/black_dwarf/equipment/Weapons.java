package com.demoTime.black_dwarf.equipment;

public enum Weapons {

    SHORT_SWORD(1, false, 2, 4),
    LONG_SWORD(1, true, 3, 6),
    BATTLE_AXE(2, true, 6, 11),
    WIZZARD_STAFF(2, true, 2, 6),
    WAND(1, true, 3, 6);

    private int handsNeeded;
    private boolean mainHand;
    private int[] damage = new int[2];

    private Weapons(int handsNeeded, boolean mainHand, int min, int max) {
        this.handsNeeded = handsNeeded;
        this.mainHand = mainHand;
        this.damage[0] = min;
        this.damage[1] = max;
    }

}
