package pl.gwsoft.structure;

import java.util.LinkedList;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.push("Test 1");
        q.push("Test 2");
        q.push("Test 3");
        q.print();

        System.out.println("Zdejmuje: " + q.pop());
        q.print();

        //To samo przy użyciu ArrayDeque
        java.util.Queue<String> queue = new java.util.ArrayDeque<>();
        queue.add("test 1");
        queue.add("test 2");
        queue.add("test 3");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
