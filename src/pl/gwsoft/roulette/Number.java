package pl.gwsoft.roulette;

import pl.gwsoft.roulette.enums.BetType;
import pl.gwsoft.roulette.enums.Colour;
import pl.gwsoft.roulette.enums.Dozen;
import pl.gwsoft.roulette.enums.Parity;

import java.util.HashSet;
import java.util.Set;

public class Number {
    private static final int[] RED = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    private int value;
    private Set<BetType> betTypes;

    public Number(int value) {
        this.value = value;
        betTypes = new HashSet<>();
        checkDozen(value);
        checkColour(value);
        checkParity(value);
    }

    public int getValue() {
        return value;
    }

    private void checkParity(int value) {
        if (value == 0) {
            betTypes.add(Parity.ZERO);
        } else {
            if (value % 2 == 0) {
                betTypes.add(Parity.EVEN);
            } else {
                betTypes.add(Parity.ODD);
            }
        }
    }

    private void checkColour(int value) {
        if (value == 0) {
            betTypes.add(Colour.GREEN);
        } else if (isRed(value)) {
            betTypes.add(Colour.RED);
        } else {
            betTypes.add(Colour.BLACK);
        }
    }

    private boolean isRed(int value) {
        for (int red : RED) {
            if (red == value) return true;
        }
        return false;
    }

    public boolean hasBetType(BetType betType) {
        for (BetType attr : betTypes) {
            if (attr == betType) return true;
        }
        return false;
    }

    public void checkDozen(int value) {
        if (value == 0) return;
        if (value > 0 && value <= 12) {
            betTypes.add(Dozen.FIRST);
        } else if (value > 12 && value <= 24) {
            betTypes.add(Dozen.SECOND);
        } else {
            betTypes.add(Dozen.FIRST);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        betTypes.stream().forEach(a -> sb.append(" " + a + ", "));
        return sb.toString();
    }
}
