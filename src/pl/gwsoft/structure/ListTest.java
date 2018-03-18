package pl.gwsoft.structure;

public class ListTest {

    public static void main(String[] args) {
        ListaJednokierunkowa lista = new ListaJednokierunkowa();
        Element jan = new Element("Jan");
        Element adam = new Element("Adam");
        Element aleksander = new Element("Aleksander");
        lista.add(jan);
        lista.add(adam);
        lista.add(aleksander);

        System.out.println(lista);
        //spodziewam sie:
        //Jan, Adam, Aleksander


    }
}
