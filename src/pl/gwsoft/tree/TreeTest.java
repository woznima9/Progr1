package pl.gwsoft.tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addBin(1);
        tree.addBin(2);
        tree.addBin(3);
        tree.addBin(4);
        tree.addBin(5);
        tree.addBin(6);
        tree.addBin(7);
        tree.addBin(8);
        tree.addBin(9);
        tree.addBin(10);
        tree.addBin(11);
        tree.addBin(12);
        tree.addBin(13);

        System.out.println(tree.search(560)); // false
        System.out.println(tree.search(572)); // true
    }
}
