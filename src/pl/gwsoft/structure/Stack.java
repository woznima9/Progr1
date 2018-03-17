package pl.gwsoft.structure;

import java.util.Arrays;

/**
 * Kolejka LIFO (Last In First Out) - Stos
 */
public class Stack {
    private final static int SIZE = 5;
    private Integer[] stack;
    private int index;

    public Stack() {
        stack = new Integer[SIZE];
        index=-1;
    }

    public void push(Integer i) {
        index++;
        if(index >= stack.length) {
            extendStack();
        }
        stack[index] = i;
    }

    private void extendStack() {
        Integer[] newStack = new Integer[stack.length + SIZE];
        for (int i = 0; i < stack.length; i++) {
            newStack[i]=stack[i];
        }
        stack = newStack;
    }

    public Integer pop() {
        Integer tmp = stack[index];
        index--;
        return tmp;
    }
    public Integer peek() {
        return stack[index];
    }

    public int size() {
        return index;
    }

    public void print(){
        for (int i =index; i>= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
