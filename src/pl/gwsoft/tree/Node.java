package pl.gwsoft.tree;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private List<Node> children;
    private Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void add(Node node) {
    }

    public List<Node> getChildren() {
        if(children == null) children = new LinkedList<>();
        return children;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
