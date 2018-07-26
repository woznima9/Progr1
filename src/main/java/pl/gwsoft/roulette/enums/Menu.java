package pl.gwsoft.roulette.enums;

public enum Menu {
    NUMBER(1, "Konkretna liczba"), COLOUR(2, "Kolor"),
    PARITY(3, "Parzysty/nieparzysty/zero"), DOZEN(4, "Tuzin"),
    SPIN(5, "Koniec zakładów"), PRINT_BETS(6, "Pokaż zakłady"), QUIT(7, "Wyjście");

    private final String desc;
    private final int number;

    Menu(int number, String desc) {
        this.number = number;
        this.desc = desc;
    }

    public int getNumber() {
        return number;
    }

    public String getDesc() {
        return desc;
    }
}
