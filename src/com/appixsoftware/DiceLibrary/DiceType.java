package com.appixsoftware.DiceLibrary;

/**
 *
 * @author joseluis-mondragon
 */
public enum DiceType {

    D4("D4", 4),
    D6("D6", 6),
    D8("D8", 8),
    D10("D10", 10),
    D12("D12", 12),
    D20("D20", 20),
    D100("D100", 100);

    private final String name;
    private final int sides;

    DiceType(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public int getSides() {
        return sides;
    }
}
