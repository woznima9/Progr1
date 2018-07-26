package pl.gwsoft.tree;

import pl.gwsoft.structure.Stack;

public class Tree {
    private Node root;
    private Node lastElement;

    void addBST(Integer value) {
        if(root == null) {
            root = new Node(value, null);
        }else {
            lastElement = new Node(value, root);
            root.add(lastElement);
        }
    }

    void addBin(Integer value) {
        if(root == null) {
            root = new Node(value, null);
        }else {
            lastElement = new Node(value, root);
            root.addBin(lastElement);
        }
    }

    private void swap(Node actual, Node parent) {
        root.swap(actual, parent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Root:\n");
        sb.append(root.getValue());
        sb.append("\n");
        sb.append(root.toString());
        return sb.toString();
    }

    public boolean search(Integer value) {
        //ver1
        if(root.getValue().equals(value)) {
            return true;
        }else {
            return root.search(value);
        }

        //ver2
//        Node actual = root;
//        while(actual != null && actual.getValue() != value) {
//            //actual = (actual.key > key) ? actual.left : actual.right;
//            if(actual.getValue() > value){
//                actual = actual.getLeft();
//            } else {
//                actual = actual.getRight();
//            }
//        }
//        if(actual == null)
//            return false;
//        return true;
    }
}
