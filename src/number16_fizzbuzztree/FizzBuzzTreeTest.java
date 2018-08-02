package number16_fizzbuzztree;

import static number16_fizzbuzztree.FizzBuzzTree.fizzBuzzTree;

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
        fizzBuzzTree(testTree);
    }

    @org.junit.jupiter.api.Test
    void nullTreeTest() {
        BinaryTree testTree = new BinaryTree();
        fizzBuzzTree(testTree);
    }

    @org.junit.jupiter.api.Test
    void oneNodeTree() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(8);
        fizzBuzzTree(testTree);
    }

}