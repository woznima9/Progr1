package pl.gwsoft.heap;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    private Node<T> parent;
    private T element;
    private List<Node<T>> children = new LinkedList<>();
    private Node<T> leftChild;
    private Node<T> rightChild;
    private int level;
    private int displayLevel;

    public Node(T element, Node<T> parent){
        this.parent = parent;
        this.element = element;
    }

    public void setElement(T element){
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void addChild(T element){
        if(leftChild == null){
            leftChild = new Node<T>(element, this);
            leftChild.setLevel();
            children.add(leftChild);
        }
        else if (rightChild == null){
            rightChild = new Node<T>(element, this);
            rightChild.setLevel();
            children.add(rightChild);
        }
    }


    public boolean isLeftChild(){
        return this.parent.getLeftChild().equals(this);
//        if(this.parent.getLeftChild().equals(this)){
//            return true;
//        }
//        else{
//            return false;
//        }
    }


    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
    public Node<T> getParent() {
        return parent;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }
    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public List<Node<T>> getChildren(){
        return children;
    }

    public boolean isLeaf(){
        return leftChild == null && rightChild == null;
//        if(leftChild==null&&rightChild==null){
//            return true;
//        }
//        return false;
    }

    public void setLevel() {
        level = this.parent == null ? 0 : parent.getLevel() + 1;
//        if (this.parent == null){
//            level = 0;
//        }
//        else{
//            level = parent.getLevel() + 1;
//        }
    }

    public void setDisplayLevel(int index) {
        displayLevel = index;
    }

    public int getDisplayLevel() {
        return displayLevel;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(int i = 0; i < (getDisplayLevel() + 1); i++){
            sb.append("\t");
        }
        if(leftChild == null && rightChild == null){
            return getElement().toString();
        }
        else if(leftChild == null){
            rightChild.setDisplayLevel(displayLevel + 1);
            return getElement() + sb.toString() + rightChild;
        }
        else if(rightChild == null){
            leftChild.setDisplayLevel(displayLevel + 1);
            return getElement() + sb.toString() + leftChild;
        }
        else{
            leftChild.setDisplayLevel(displayLevel + 1);
            rightChild.setDisplayLevel(displayLevel + 1);
            return getElement() + sb.toString() + leftChild + sb.toString() + rightChild;
        }
    }
}
