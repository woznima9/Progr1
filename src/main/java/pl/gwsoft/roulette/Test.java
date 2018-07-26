package pl.gwsoft.roulette;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer: ");
        int option = 0;
        do {
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Podales nieprawilowa warotsc, " +
                        "wpisz jeszccze raz!");
                scanner.next();
            }
        }while(option == 0);

        //https://stackoverflow.com/questions/10604125/how-can-i-clear-the-scanner-buffer-in-java
        Scanner in=new Scanner(System.in);
        int rounds = 0;
        while (rounds < 1 || rounds > 3) {
            System.out.print("How many rounds? ");
            if (in.hasNextInt()) {
                rounds = in.nextInt();
            } else {
                System.out.println("Invalid input. Please try again.");
                System.out.println();
                in.next(); //read buffor
            }
            // Clear buffer
        }
        System.out.print(rounds+" rounds.");

        System.out.println("Podales numer: " + option);
        testMethodExc();
    }

    private static void testMethodExc() {


    }
}
