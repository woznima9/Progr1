package pl.gwsoft.structure;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.push("Test 1");
        q.push("Test 2");
        q.push("Test 3");
        q.print();

        System.out.println("Zdejmuje: " + q.pop());
        q.print();
    }
}
