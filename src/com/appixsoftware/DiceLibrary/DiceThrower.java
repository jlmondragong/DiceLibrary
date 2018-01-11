package com.appixsoftware.DiceLibrary;

import java.util.Random;

/**
 *
 * @author joseluis-mondragon
 */
public class DiceThrower {

    public Dice[] getThrow(int sidesNumber, int cuantity) {

        Dice[] dices = new Dice[cuantity];
        Random random = new Random();

        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice(sidesNumber);
            int value = random.nextInt(sidesNumber) + 1;
            dices[i].setCurrentValue(value);
        }

        return dices;
    }
}
