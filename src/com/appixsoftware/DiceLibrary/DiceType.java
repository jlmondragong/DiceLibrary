package com.appixsoftware.DiceLibrary;

/**
 *
 * @author joseluis-mondragon
 */
public enum DiceType {

    D4("d4", 4),
    D6("d6", 6),
    D8("d8", 8),
    D10("d10", 10),
    D12("d12", 12),
    D20("d20", 20),
    D100("d100", 100);

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
