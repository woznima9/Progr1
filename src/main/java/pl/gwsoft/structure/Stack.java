package pl.gwsoft.structure;

/**
 * Kolejka LIFO (Last In First Out) - Stos
 */
public class Stack<T> {
    private final static int SIZE = 5;
    private Object[] stack;
    private int index;

    public Stack() {
        stack = new Object[SIZE];
        index=-1;
    }

    public void push(T i) {
        if(index >= stack.length-1) {
            extendStack();
        }
        stack[++index] = i;
    }

    private void extendStack() {
        Object[] newStack = new Object[stack.length + SIZE];
        for (int i = 0; i < stack.length; i++) {
            newStack[i]=stack[i];
        }
        stack = newStack;
    }

    public T pop() {
        return (T) stack[index--];
    }

    public T peek() {
        return (T) stack[index];
    }

    public int size() {
        return index;
    }

    public void print(){
        for (int i =index; i>= 0; i--) {
//            System.out.println("-----");
            System.out.println("| " + stack[i]+" |");
        }
//        System.out.println("-----");
    }
}
