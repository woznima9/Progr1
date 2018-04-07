package pl.gwsoft.heap;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HeapSort<T> {
    private List<Node<T>> stackOfParents;
    private List<T> sortedElements;


    public List<T> sort(Tree<T> tree){
        sortedElements = new ArrayList<>();
        for (int i = tree.size(); i > 0; i--) {
            stackOfParents = getStackOfParents(tree);
            for (int j = stackOfParents.size() - 1; j >= 0 ; j--) {
                compareChildrenWithParent(stackOfParents.get(j), tree);
            }
            //max heap
            sortedElements.add(0, tree.getNode(0).getElement());
            tree.swapNodes(0, tree.size() - 1);
            tree.removeNode(tree.size() - 1);
        }
        return sortedElements;
    }


    private void compareChildrenWithParent(Node<T> parent, Tree<T> tree){
        if(parent.getRightChild() != null){
            if(isFirstGreaterOrEqual(parent.getLeftChild(),parent.getRightChild())){
                if(isFirstGreaterOrEqual(parent.getLeftChild(), parent)){
                    tree.swapNodes(parent, parent.getLeftChild());
                    compareChildrenWithParent(parent.getLeftChild(), tree);
                }
            }
            else{
                if(isFirstGreaterOrEqual(parent.getRightChild(), parent)){
                    tree.swapNodes(parent, parent.getRightChild());
                    compareChildrenWithParent(parent.getRightChild(), tree);
                }
            }
        }
        else if(parent.getLeftChild() != null){
            if(isFirstGreaterOrEqual(parent.getLeftChild(), parent)){
                tree.swapNodes(parent, parent.getLeftChild());
                compareChildrenWithParent(parent.getLeftChild(), tree);
            }
        }
    }

    private List<Node<T>> getStackOfParents(Tree<T> tree){
        Node<T> current = tree.getNode(0);
        List<Node<T>> stack = new LinkedList<>();
        int counter = 0;
        while (isParent(current)) {
            stack.add(current);
            current = tree.getNode(++counter);
        }
        return stack;
    }



    private boolean isParent(Node<T> node){
        if(!node.isLeaf()){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isFirstGreaterOrEqual(Node<T> firstNode, Node<T> secondNode){
        if (firstNode.getElement() instanceof Integer){
            if(((Integer)firstNode.getElement() >= (Integer)secondNode.getElement())){
                return true;
            }
            else{
                return false;
            }
        }
        else if(firstNode.getElement() instanceof String){
            int number = String.CASE_INSENSITIVE_ORDER.compare((String)firstNode.getElement(), (String)secondNode.getElement());
            if(number >= 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            throw new WrongMethodTypeException();
        }
    }
}