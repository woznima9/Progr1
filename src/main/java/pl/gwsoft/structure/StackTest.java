package pl.gwsoft.structure;

public class StackTest {
    //armstrong number algorithm

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.print();

        System.out.println("Zdejmuje: " + stack.pop());

        stack.print();

        Stack<String> stackText = new Stack<String>();
        stackText.push("Ala");
        stackText.push("ma");
        stackText.push("kota ");
        stackText.print();

        System.out.println("Zdejmuje: " + stackText.pop());

        stackText.print();

        //To samo tylko z biblioteka z javy java.util.Stack
        java.util.Stack<String> s = new java.util.Stack<>();
        s.push("aaa");
        s.push("bb");
        s.push("c");
        System.out.println(s);
        System.out.println("Zdejmuje: " + s.pop());
        System.out.println(s);
    }
}
