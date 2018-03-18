package pl.gwsoft.structure;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJednokierunkowa lista = new ListaJednokierunkowa();
        Node jan = new Node("Jan");
        Node adam = new Node("Adam");
        Node aleksander = new Node("Aleksander");

        lista.add(jan);
        lista.add(adam);
        lista.add(aleksander);

        System.out.println(lista);
        //spodziewam sie:
        //Jan, Adam, Aleksander

        lista.remove(1);
        System.out.println(lista);
        //spodziewam sie:
        //Jan, Adam, Aleksander

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
