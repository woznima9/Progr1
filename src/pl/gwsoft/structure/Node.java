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

    @Override
    public String toString() {
        if (next != null) {
            return text + ", " + String.valueOf(next);
        } else {
            return text;
        }
    }

    public Node getNext() {
        return next;
    }

    public void removeRef() {
        next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
