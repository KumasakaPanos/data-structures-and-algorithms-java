import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTreeTest {

    @org.junit.jupiter.api.Test
    void normalTreeTest() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(8);
        testTree.add(12);
        testTree.add(4);
        testTree.add(1);
        testTree.add(7);
        testTree.add(9);
        testTree.add(14);
        FizzBuzzTree.fizzBuzzTree(testTree);
    }

    @org.junit.jupiter.api.Test
    void nullTreeTest() {
        BinaryTree testTree = new BinaryTree();
        FizzBuzzTree.fizzBuzzTree(testTree);
    }

    @org.junit.jupiter.api.Test
    void oneNodeTree() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(8);
        FizzBuzzTree.fizzBuzzTree(testTree);
    }

}