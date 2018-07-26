package pl.gwsoft.structure;

/**
 * Kolejka FIFO (First In First Out)
 */
public class Queue<T> {
    private static final int SIZE = 5;
    private Object[] array;
    private int index;

    public Queue() {
        array= new Object[SIZE];
        index= -1;
    }

    public void push(T element) {
        if(index >= array.length-1) {
            extendQueue();
        }
        array[++index] = element;
    }

    private void extendQueue() {
        Object[] newQueue = new Object[array.length + SIZE];
        for (int i = 0; i < array.length; i++) {
            newQueue[i]=array[i];
        }
        array = newQueue;
    }

    public T pop() {
        Object element = array[0];
        for (int i =0 ; i<= index; i++) {
            array[i] = array[i+1];
        }
        array[index] = null;
        index--;
        return (T) element;
    }

    public void print() {
        for (int i = 0; i<=index; i++) {
            System.out.println(array[i]);
        }
    }
    public T peek() {
        //TODO
        return null;
    }

    public int size() {
        //TODO
        return 0;
    }
}
