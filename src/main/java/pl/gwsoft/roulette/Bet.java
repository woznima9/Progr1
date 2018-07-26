package pl.gwsoft.roulette;

import pl.gwsoft.roulette.enums.BetType;

public class Bet {
    private BetType betType;
    private int number;
    private int value;
    private int multiplier;

    public Bet(int number, int value) {
        this.number = number;
        this.value = value;
    }

    public Bet(BetType betType, int value) {
        this.betType = betType;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BetType getBetType() {
        return betType;
    }

    @Override
    public String toString() {
        if(betType == null){
            return String.format("Zakład na liczbę %s, kwota %s", number, value);
        }else {
            return String.format("Zakład na %s, kwota %s", betType, value);
        }
    }
}
