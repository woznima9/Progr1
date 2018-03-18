package pl.gwsoft.structure;

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


    }
}
