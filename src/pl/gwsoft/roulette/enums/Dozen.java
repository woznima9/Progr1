package pl.gwsoft.roulette.enums;

public enum Dozen implements BetType {
    FIRST(3), SECOND(3), THIRD(3);

    private final int multiplier;

    Dozen(int multiplier){
        this.multiplier = multiplier;
    }

    @Override
    public int getMultiplier() {
        return multiplier;
    }

    @Override
    public String toString() {
        return "Tuzin: " + super.toString();
    }
}
