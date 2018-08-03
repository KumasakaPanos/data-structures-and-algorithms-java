package number_19_identical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class determineDuplicateTest {

    @Test
    void identicalTrue() {
        BinaryTree testTree1 = new BinaryTree(1);
        testTree1.add(5);
        testTree1.add(9);
        testTree1.add(10);

        BinaryTree testTree2 = new BinaryTree(1);
        testTree2.add(5);
        testTree2.add(9);
        testTree2.add(10);

        assertEquals(true,testTree2.identical(testTree1));
    }
    @Test
    void identicalFalse(){
        BinaryTree testTree1 = new BinaryTree(1);
        testTree1.add(5);
        testTree1.add(9);
        testTree1.add(10);

        BinaryTree testTree2 = new BinaryTree(1);
        testTree2.add(5);
        testTree2.add(9);
        testTree2.add(11);

        assertEquals(false,testTree2.identical(testTree1));
    }
    @Test
    void identicalNull(){
        BinaryTree testTree1 = new BinaryTree();
        BinaryTree testTree2 = new BinaryTree();

        assertEquals(true,testTree2.identical(testTree1));
    }
}