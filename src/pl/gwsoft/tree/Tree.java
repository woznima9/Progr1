package pl.gwsoft.tree;

import java.time.LocalDate;

public class Tree {
    private Node root;

    void add(Integer value) {
        if(root == null) {
            root = new Node(value);//, null, LocalDate.now());
        }else {
            root.add(new Node(value));//, root, LocalDate.now()));
        }
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
