import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstTest {

    @org.junit.jupiter.api.Test
    void normalTest() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(3);
        testTree.add(2);
        testTree.add(1);
        testTree.add(4);
        testTree.add(5);

        assertEquals("32415",BreadthFirst.Traversal(testTree));
    }

    @org.junit.jupiter.api.Test
    void smallTreeTest() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(1);

        assertEquals("1",BreadthFirst.Traversal(testTree));
    }
    @org.junit.jupiter.api.Test
    void emptyTreeTest() {
        BinaryTree testTree = new BinaryTree();

        assertEquals("",BreadthFirst.Traversal(testTree));
    }
}