package pl.gwsoft.structure;

public class ListaJednokierunkowa<T> {
    private Node<T> first;
    private int size;
    //TODO dodać zmienna size
    //zaimplementowac metode size() ktora zwraca wielkosci listy
    //zaimplementowac metody removeFirst() i removeLast()
    //zaimplementować metode get(index) która zwróci element o danym indexie
    //z listy
    public void add(String e) {
        size++;
        if(first == null) {
            first = new Node(e);
        }else {
            first.addNext(new Node(e));
        }
    }

    @Override
    public String toString() {
        return "[" + first + "]";
    }

    public void remove(int index) {
        size--;
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

    public String get(int index) {
        if((index+1) > size) throw new IndexOutOfBoundsException();
        Node n = first;
        for (int i=0; i<index; i++) {
            n = n.getNext();
        }
        return n.getText();
    }

}
