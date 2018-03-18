package pl.gwsoft.stream;

import pl.gwsoft.stream.util.Car;
import pl.gwsoft.stream.util.Month;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises2 {

    public static void main(String[] args) {
        //Utworz klase Car z polami, markaImodel, kolor i prednkosc
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Opel Astra", "Czarny", 150));
        cars.add(new Car("Ferrari 458", "Czerwony", 350));
        cars.add(new Car("Ford Mustang", "Zielony", 250));
        cars.add(new Car("Skoda Superb", "Biały", 240));

        Map<Car, String> map = cars.stream().filter(car -> car.getColour().equals("Czarny"))
                .sorted(Comparator.comparing(Car::getColour))
                .filter(car -> car.getBrandAndmodel().contains("a"))
                .collect(Collectors.toMap(k -> k, v -> v.getColour()));
        System.out.println(map);
        //1. Odfiltrowac Kolor czarny
        //2. Posortowac alfabetycznie po kolorach
        //3. Odfiltrowac te ktore mają w nazwie m
        //4. Skonwertowac List<Car> do Map<String, Car> <samochod, kolor>

        //Zad2
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));

        List<String> months =
                Arrays.asList("Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec",
                "Lipiec", "Sierpień", "Wrzesień","Paździenrik", "Listopad", "Grudzień");

        months.stream()
                .map(e -> new Month(e))
                .sorted(Comparator.comparing(Month::getName))
                .filter(e -> e.getName().contains("r"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

                //Zrobić kolekcję miesiecy jako stringi
                //skonwertować do obiektu miesiac (nazwa, ilosc dni)
                // posortowac wzgledem ilosci dni
                //odfiltrowac tylko te z litera r

    }
}
