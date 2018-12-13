package com.demoTime.black_dwarf.util;

import java.util.Random;

public class Dice {

    private Random random = new Random();

    private int throwDice() {
        return random.nextInt(6) + 1;
    }

    public int throwDice(int diceThrows) {
        int total = 0;
        for (int i = 0; i <= diceThrows; i++) {
            total += throwDice();
        }
        return total;
    }

    public int SingleDiceThrow(int max) {
        return random.nextInt(max);
    }

}
