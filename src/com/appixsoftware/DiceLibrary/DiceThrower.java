package com.appixsoftware.DiceLibrary;

import java.util.Random;

/**
 *
 * @author joseluis-mondragon
 */
public class DiceThrower {

    public Dice[] getThrow(DiceType diceType, int cuantity) {

        Dice[] dices = new Dice[cuantity];
        Random random = new Random();

        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice(diceType);
            int value = random.nextInt(diceType.getSides()) + 1;
            dices[i].setCurrentValue(value);
        }

        return dices;
    }
}
