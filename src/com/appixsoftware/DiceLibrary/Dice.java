package com.appixsoftware.DiceLibrary;

/**
 *
 * @author joseluis-mondragon
 */
public class Dice {

    private final Integer sidesNumber;
    private Integer currentValue;
    private final Integer MINIMUM_VALUE=1;

    public Dice(Integer sidesNumber) {
        this.sidesNumber = sidesNumber;
    }
    
    /**
     *
     * @return the name of the dice, for example D6, D20 and so on.
     */
    public String getDiceName() {
        return "D" + sidesNumber;
    }

    /**
     * @return the sidesNumber
     */
    public Integer getSidesNumber() {
        return sidesNumber;
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
        if(currentValue>sidesNumber||currentValue<MINIMUM_VALUE){
            throw new RuntimeException("The current value must be between (inclusive) "+MINIMUM_VALUE+" and "+sidesNumber);
        }
        this.currentValue = currentValue;
    }

}
