package pl.gwsoft.tree;

public class Tree {
    private Node root;

    void add(Integer value) {
        if(root == null) {
            root = new Node(value, null);
        }else {
            root.add(new Node(value, root));
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
}
