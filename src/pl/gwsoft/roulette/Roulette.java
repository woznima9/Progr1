package pl.gwsoft.roulette;

import pl.gwsoft.roulette.enums.Colour;
import pl.gwsoft.roulette.enums.Dozen;
import pl.gwsoft.roulette.enums.Menu;
import pl.gwsoft.roulette.enums.Parity;

import java.util.*;

/**
 * Nie pełna wersja ruletki. Brak działania przeliczania wygranej.
 * Klasa korzysta z obiektu scanner.
 * Zadanie:
 * 1. Przerobić tak aby scanner nie byl uzywany wewnatrz tej klasy,
 * aby ruletka była czystą ruletka :)
 * 2. Dodać przeliczanie wygranej
 */
public class Roulette {
    private Random random;
    private Scanner scanner;
    private Player player;
    private Number randomNumber;
    private List<Bet> bets;

    public Roulette() {
        random = new Random();
        scanner = new Scanner(System.in);
        bets = new ArrayList<>();
    }

    public void addBet(Menu option) {
        System.out.print("Ile chcesz postawić: ");
        int value = scanner.nextInt();
        player.takeMoney(value);
        int menu = 0;
        switch (option){
            case COLOUR:
                System.out.println("Jaki kolor: 1 - RED, 2 - BLACK, 3 - ZERO");
                menu = scanner.nextInt();
                bets.add(new Bet(Colour.values()[menu], value));
                break;
            case DOZEN:
                System.out.println("Ktory tuzin: 1 (1-12), 2 (13-24) czy 3 (24-36)");
                menu = scanner.nextInt();
                bets.add(new Bet(Dozen.values()[menu], value));
                break;
            case PARITY:
                System.out.println("Jaki kolor: 1 - PARZYSTE, 2 - NIEPARZYSTE, 3 - ZERO");
                menu = scanner.nextInt();
                bets.add(new Bet(Parity.values()[menu], value));
                break;
            case NUMBER:
                System.out.println("Podaj liczbe: ");
                int number = scanner.nextInt();
                bets.add(new Bet(number, value));
                break;
        }
    }

    public void spinRoulette() {
        randomNumber = new Number(random.nextInt(36));
    }

    public boolean start(Player player) {
        this.player = player;
        printInfo(player);
        Menu option = printMenu();
        switch (option) {
            case QUIT: return true;
            case PRINT_BETS:
                printBets();
                break;
            case SPIN:
                spinRoulette();
                printNumber();
                calculateWinning();
                resetBets();
                break;
            default: addBet(option);
        }


        return false;
    }

    private void printBets() {
        System.out.println("Lista zakładów:");
        bets.forEach(System.out::println);
        //ten sam równoznaczny zapis:
        //bets.forEach(entry -> System.out.println(entry));
    }

    private void resetBets() {
        bets = new ArrayList<>();
    }

    private void calculateWinning() {
        //iterujemy po zakladach i sprawdzamy czy ktorys pasuje
        //jezeli tak to pobieramy
        bets.forEach(bet -> {
            if(bet.getBetType() == null) {
                if(randomNumber.getValue() == bet.getValue()) {
                    System.out.println("Traffiles wygrana = " + (bet.getBetType().getMultiplier() * bet.getValue()));
                }
            }else {
                if(randomNumber.hasBetType(bet.getBetType())) {
                    System.out.println("Traffiles wygrana = " + (bet.getBetType().getMultiplier() * bet.getValue()));
                    //TODO

                };
            }
        });
    }

    private void printNumber() {
        System.out.println("Wylosowano liczbę: " + this.randomNumber);
    }

    private void printInfo(Player player) {
        System.out.println("Witamy w grze " + player.getName() + " !");
        System.out.println("Dysponujesz kwotą: " + player.getMoney() + " " + player.getCurrency());
        System.out.println("");
    }

    private Menu printMenu() {
        System.out.println("Jakiego zakładu chcesz dokonać: ");
        Arrays.stream(Menu.values()).forEach(o -> System.out.println(o.getNumber() + ": " + o.getDesc()));
        int option = scanner.nextInt();
        return Menu.values()[option-1];
    }
}
