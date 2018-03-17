package pl.gwsoft.structure;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.print();

        System.out.println("Zdejmuje: " + stack.pop());

        stack.print();

    }
}
