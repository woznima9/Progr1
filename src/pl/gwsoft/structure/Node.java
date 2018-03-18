package pl.gwsoft.structure;

public class Node {
    private Node next;
    private String text;

    public Node(String text) {
        this.text = text;
    }

    public void addNext(Node e) {
        if (next == null) {
            next = e;
        } else {
            next.addNext(e);
        }
    }

}
