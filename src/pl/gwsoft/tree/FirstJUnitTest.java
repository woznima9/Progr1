package pl.gwsoft.tree;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstJUnitTest {
    private Tree tree;

    @Before
    public void setUp() {
        System.out.println("set up");
        tree = new Tree();
        tree.addBST(500);
        tree.addBST(100);
    }

    @Test
    public void testSearchBST(){
        Assert.assertTrue(tree.search(500));
        Assert.assertFalse(tree.search(999));
    }

    @Test
    public void testTree1(){
        Assert.assertTrue(tree.search(500));
        Assert.assertFalse(tree.search(999));
    }

    @Test
    public void testTree2(){
        Assert.assertTrue(tree.search(500));
        Assert.assertFalse(tree.search(999));
    }




}
