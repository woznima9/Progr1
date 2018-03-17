package pl.gwsoft.roulette;

import java.util.Currency;

public class Player {

    private String name;
    private int money;
    private String currency;

    public Player(String name, int money, String currency) {
        this.name = name;
        this.money = money;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public boolean takeMoney(int value) {
        if((money - value)<0)
            return false;
        money -=value;
        return true;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }
}
