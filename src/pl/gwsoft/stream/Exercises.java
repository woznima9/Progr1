package pl.gwsoft.stream;

import java.util.Calendar;

public class Exercises {

    public static void main(String[] args) {
        //Utworz klase Car z polami, markaImodel, kolor i prednkosc

        //1. Skonwertowac List<Car> do Map<String, Car> <kolor, samochod>
        //2. Odfiltrowac Kolor czarny
        //3. Posortowac alfabetycznie po kolorach
        //4. Odfiltrowac te ktore mają w nazwie m

        //Zad2
        //Zrobić kolekcję miesiecy jako stringi
        //skonwertować do obiektu miesiac (nazwa, ilosc dni)
        // posortowac wzgledem ilosci dni
        //odfiltrowac tylko te z litera r
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));

    }
}
