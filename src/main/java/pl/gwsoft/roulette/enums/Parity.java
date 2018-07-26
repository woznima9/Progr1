package pl.gwsoft.roulette.enums;

public enum Parity implements BetType {
    ODD(2), EVEN(2), ZERO(35);

    private final int multiplier;

    Parity (int multiplier){
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
