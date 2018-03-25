package pl.gwsoft.tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(560);
        tree.add(20);
        tree.add(60);
        tree.add(5);
        tree.add(540);
        tree.add(25);
        tree.add(59);
        tree.add(200);
        tree.add(2000);
        tree.add(572);


        System.out.println(tree.search(560)); // false
        System.out.println(tree.search(572)); // true
    }
}
