package pl.gwsoft.tree;

import pl.gwsoft.structure.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Node {
    private Node parent;
    private Node left;
    private Node right;
    private Integer value;

    public Node(Integer value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public Integer getValue() {
        return value;
    }

    public void add(Node node) {
        Node actual = this;
        Node parent = null;
        while (actual != null) {
            parent = actual;
            if (actual.value > node.getValue()) {
                actual = actual.left;
            } else {
                actual = actual.right;
            }
        }

        if (parent.value > node.getValue()) {
            parent.left = node;
            parent.left.parent = parent;
        } else {
            parent.right = node;
            parent.right.parent = parent;
        }
    }

    public void addBin(Node node) {
        Node actual = this;
        Queue<Node> queue = new ArrayDeque<>();
        while (true) {
            if (actual.left == null) {
                node.parent = actual;
                actual.left = node;
                break;
            } else {
                queue.add(actual.left);
            }
            if (actual.right == null) {
                node.parent = actual;
                actual.right = node;
                break;
            }else {
                queue.add(actual.right);
            }
            actual = queue.poll();
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public boolean search(Integer value) {
        Node actual = this;
        while (actual != null && actual.value != value) {
            if (actual.value > value) {
                actual = actual.left;
            } else {
                actual = actual.right;
            }
        }
        if (actual == null) {
            return false;
        }
        return true;
    }

    public Node getParent() {
        return parent;
    }

    public void swap(Node actual, Node parent) {
        Integer tmp = actual.value;
        actual.value = parent.value;
        parent.value = tmp;
    }
}
