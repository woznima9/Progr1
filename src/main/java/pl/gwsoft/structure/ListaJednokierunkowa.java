package pl.gwsoft.structure;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class ListaJednokierunkowa<T> extends AbstractSequentialList<T> implements List<T> {
    private Node<T> first;
    private int size;

    //TODO zaimplementowac metody removeFirst() i removeLast()

    @Override
    public int size() {
        return size;
    }

    public boolean add(T e) {
        size++;
        if(first == null) {
            first = new Node(e);
        }else {
            first.addNext(new Node(e));
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + first + "]";
    }

    public T remove(int index) {
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
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new NotImplementedException();
    }

    public T get(int index) {
        if((index+1) > size) throw new IndexOutOfBoundsException();
        Node n = first;
        for (int i=0; i<index; i++) {
            n = n.getNext();
        }
        return (T) n.getText();
    }

}
