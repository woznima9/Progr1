package pl.gwsoft.structure;

import pl.gwsoft.stream.util.Car;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Object> lista = new ListaJednokierunkowa<Object>();
        lista.add(new Car("Fiat", "Niebieski", 1));
        lista.add(new Car("Mercedes", "biały", 1));
        lista.add(new Integer("123"));
        lista.add("Jan");

        System.out.println(lista);
        //spodziewam sie:
        //Jan, Adam, Aleksander

        lista.remove(1);
        System.out.println(lista);
        //spodziewam sie:
        //Adam, Aleksander

        Object obj = lista.get(1);
        System.out.println(obj);
        //spodziewam sie:
        //Aleksander

        System.out.println("--------------");
        //przykład z implementacją listy która jest
        //zdefiniowana w javie
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Jan");
        linkedList.add("Adam");
        linkedList.add("Aleksander");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
