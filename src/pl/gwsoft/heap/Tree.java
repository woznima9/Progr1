package pl.gwsoft.heap;

import java.util.LinkedList;
import java.util.List;

public class Tree<T> {
    private Node<T> root;
    private LinkedList<Node<T>> queue = new LinkedList<>();
    private int size;

    public void addNode(T element) {
        Node<T> current = root;
        if (root == null) {
            root = new Node<>(element, null);
            size++;
        } else {
            while (true) {
                if (current.getChildren().size() == 2) {
                    queue.add(current.getLeftChild());
                    queue.add(current.getRightChild());
                    current = queue.get(0);
                    queue.remove(0);
//                    current = queue.pop();
                } else {
                    current.addChild(element);
                    size++;
                    break;
                }
            }
        }
        queue.clear();
    }

    public int size() {
        return size;
    }

    public Node<T> getNode(int index) {
        queue.clear();
        int counter = 0;
        Node<T> current = root;
        if (index == 0) {
            return root;
        } else {
            while (queue.size() - 1 < index) {
                if (current.getChildren().size() == 2) {
                    queue.add(current.getLeftChild());
                    queue.add(current.getRightChild());
                    current = queue.get(counter++);
                } else if (current.getChildren().size() == 1) {
                    queue.add(current.getLeftChild());
                    current = queue.get(counter++);
                } else if (current.getChildren().size() == 0) {
                    break;
                }
            }
        }
        queue.get(index - 1).setDisplayLevel(0);
        return queue.get(index - 1);
    }

    public void removeNode(int index) {
        if(index <= size() - 1){
            Node<T> nodeToRemove = getNode(index);
            Node<T> lastNode = getLastNode();
            nodeToRemove.setElement(lastNode.getElement());
            if(lastNode.getParent() != null){
                if(lastNode.isLeftChild()) {
                    lastNode.getParent().getChildren().remove(0);
                    lastNode.getParent().setLeftChild(null);
                }
                else{
                    lastNode.getParent().getChildren().remove(1);
                    lastNode.getParent().setRightChild(null);
                }
            }
            lastNode.setParent(null);
            size--;
        }
    }


    public Node<T> getLastNode() {
        queue.clear();
        int counter = 0;
        Node<T> current = root;
        if(size() == 1){
            return root;
        }
        while (true) {
            if (current.getChildren().size() == 2) {
                queue.add(current.getLeftChild());
                queue.add(current.getRightChild());
                current = queue.get(counter++);
            } else if (current.getChildren().size() == 1) {
                queue.add(current.getLeftChild());
                current = queue.get(counter++);
            } else {
                return queue.get(queue.size() - 1);
            }
        }
    }

    public List<Node<T>> getChildren() {
        return root.getChildren();
    }

    public void swapNodes(int firstIndex, int secondIndex) {
        if (firstIndex != secondIndex) {
            Node<T> firstNode = getNode(firstIndex);
            Node<T> secondNode = getNode(secondIndex);
            T tempElement = firstNode.getElement();
            firstNode.setElement(secondNode.getElement());
            secondNode.setElement(tempElement);
        }
    }

    public void swapNodes(Node<T> firstNode, Node<T> secondNode) {
        T tempElement = firstNode.getElement();
        firstNode.setElement(secondNode.getElement());
        secondNode.setElement(tempElement);
    }


    @Override
    public String toString() {
        return root.toString();
    }
}

