package pl.gwsoft.day1;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Random generator = new Random();
        int value = generator.nextInt(100);

        int counter = 0;
        while(counter < 10) {
            System.out.println("Zgadnij liczbę z zakresu od 0 do 100:");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if (num == value) {

                System.out.println("Brawo to była ta liczba! Ilosc prob: " + counter);
                return;
            } else if (num < value) {
                System.out.println("Twoja liczba jest za mała, podaj większą");
            } else if (num > value) {
                System.out.println("Twoja liczba jest za duża, podaj mniejszą");
            }
            counter++;
        }


        System.out.println(value);
    }
}
