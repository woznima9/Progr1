package pl.gwsoft.structure;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJednokierunkowa<Integer> lista = new ListaJednokierunkowa<Integer>();
        lista.add(1);
        lista.add(3);
        lista.add(8);

        System.out.println(lista);
        //spodziewam sie:
        //Jan, Adam, Aleksander

        lista.remove(1);
        System.out.println(lista);
        //spodziewam sie:
        //Adam, Aleksander

        String name = lista.get(1);
        System.out.println(name);
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
