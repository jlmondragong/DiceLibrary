package com.appixsoftware.DiceLibrary;

import java.io.Serializable;

/**
 *
 * @author joseluis-mondragon
 */
public class Dice implements Serializable {

    private final DiceType diceType;
    private Integer currentValue;
    private final Integer MINIMUM_VALUE = 1;

    public Dice(DiceType diceType) {
        this.diceType = diceType;
    }

    /**
     * @return the diceType
     */
    public DiceType getDiceType() {
        return diceType;
    }

    /**
     * @return the currentValue
     */
    public Integer getCurrentValue() {
        return currentValue;
    }

    /**
     * @param currentValue the currentValue to set
     */
    public void setCurrentValue(Integer currentValue) {
        if (currentValue > diceType.getSides() || currentValue < MINIMUM_VALUE) {
            throw new RuntimeException("The current value must be between (inclusive) " + MINIMUM_VALUE + " and " + diceType.getSides());
        }
        this.currentValue = currentValue;
    }

    @Override
    public String toString() {
        return "type: " + diceType.getName() + ", value: " + currentValue;
    }

}
