package number_18_treemaxvalue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxValueTest {

    @Test
    void findMaxValueNormal() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(4);
        testTree.add(2);
        testTree.add(10);
        testTree.add(1);
        testTree.add(3);
        testTree.add(7);
        testTree.add(11);

        assertEquals(11,FindMaxValue.findMaxValue(testTree));
    }
    @Test
    void findMaxValueNullRoot() {
        BinaryTree testTree = new BinaryTree();

        assertEquals(Integer.MIN_VALUE,FindMaxValue.findMaxValue(testTree));
    }
    @Test
    void findMaxValueOnlyRoot() {

        BinaryTree testTree = new BinaryTree();
        testTree.add(9001);

        assertEquals(9001,FindMaxValue.findMaxValue(testTree));
    }
}