package pl.gwsoft.roulette.enums;

public enum Value implements BetType {
    NUMBER(35);

    private final int multiplier;

    Value (int multiplier){
        this.multiplier = multiplier;
    }

    @Override
    public int getMultiplier() {
        return multiplier;
    }

    @Override
    public String toString() {
        return "Liczba: " + super.toString();
    }
}
