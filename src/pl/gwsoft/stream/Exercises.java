package pl.gwsoft.stream;

import pl.gwsoft.stream.util.Car;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {

    public static void main(String[] args) {
        //Utworz klase Car z polami, markaImodel, kolor i prednkosc
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Opel Astra", "Czarny", 150 ));
        cars.add(new Car("Ford focus", "Niebieski", 150 ));
        cars.add(new Car("Skoda octavia", "Zielony", 150 ));
        cars.add(new Car("Fiat ducato", "Czerwony", 150 ));
        cars.add(new Car("Nissan primera", "Czarny", 150 ));

        //--1. Odfiltrowac Kolor czarny
        List<Car> list = cars.stream()
                .filter(e -> e.getColour().equals("Czarny"))
                .collect(Collectors.toList());
        Map<String, String> map = cars.stream()
                .filter(e -> e.getColour().equals("Czarny"))
                .collect(Collectors.toMap(key -> key.getBrandAndmodel(), value -> value.getColour()));

        //2. Posortowac alfabetycznie po kolorach
        //3. Odfiltrowac te ktore mają w nazwie m
        //4. Skonwertowac List<Car> do Map<String, Car> <samochod, kolor>

        //Zad2
        //Zrobić kolekcję miesiecy jako stringi
        List<String> months =
                Arrays.asList("Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec",
                        "Lipiec", "Sierpień", "Wrzesień","Paździenrik", "Listopad", "Grudzień");

        //skonwertować do obiektu miesiac -> new Month(nazwa)
        // posortowac alfabetycznie
        //odfiltrowac tylko te z litera r
    }
}
