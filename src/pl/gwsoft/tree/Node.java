package pl.gwsoft.tree;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private Node parent;
    private List<Node> children;
    private Integer value;

    public Node(Integer value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public Integer getValue() {
        return value;
    }

    public void add(Node node) {
        if(children == null) children = new LinkedList<>();
        children.add(node);
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
//        String list = children.stream().map(x->x.toString()).collect(Collectors.joining(" , "));
        return String.valueOf(value);
    }
}
