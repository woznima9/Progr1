package pl.gwsoft.roulette;

import java.util.Currency;
import java.util.Scanner;

public class RouletteGame {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("*                                       *");
        System.out.println("*               RULETKA 1.0             *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");

        Scanner scanner = new Scanner(System.in);
        Roulette roulette = new Roulette();
        System.out.println("Witamy w grze! \nProszę podać imie: ");
        String name = scanner.nextLine();
        Player player = new Player(name,1000,"PLN");
        boolean quit = false;
        while (!quit){
            quit = roulette.start(player);
        }

    }
}
