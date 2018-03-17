package pl.gwsoft.roulette.enums;

public enum Colour implements BetType {
    BLACK(2), RED(2), GREEN(35);

    private final int multiplier;

    Colour(int multiplier){
        this.multiplier = multiplier;
    }

    @Override
    public int getMultiplier() {
        return multiplier;
    }

    @Override
    public String toString() {
        return "Kolor: " + super.toString();
    }
}
