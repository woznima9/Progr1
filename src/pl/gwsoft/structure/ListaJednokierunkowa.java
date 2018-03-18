package pl.gwsoft.structure;

public class ListaJednokierunkowa {
    private Node first;
    //TODO dodać zmienna size
    //zaimplementowac metode size() ktora zwraca wielkosci listy
    //zaimplementowac metody removeFirst() i removeLast()
    //zaimplementować metode get(index) która zwróci element o danym indexie
    //z listy
    public void add(Node e) {
        if(first == null) {
            first = e;
        }else {
            first.addNext(e);
        }
    }

    @Override
    public String toString() {
        return "[" + first + "]";
    }

    public void remove(int index) {
        //TODO sprawdzenie zakresu (czy index jest prawidlowa wartoscia
        //i nie przekracza wielkosci listy
        //TODO spróbować uprościć to co poniżej
        if(index == 0) {
            Node node = first.getNext();
            first.removeRef();
            first = node;
        }else {
            Node current = first;
            Node prev = null;
            for (int i = 0; i<index; i++) {
                prev = current;
                current = current.getNext();
            }
            Node next = current.getNext();
            current.removeRef();
            prev.setNext(next);
        }
    }
}
