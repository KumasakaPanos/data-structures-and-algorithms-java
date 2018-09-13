package number20_flip_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void flip() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(3);
        testTree.add(2);
        testTree.add(1);
        testTree.add(4);
        testTree.add(5);

        BinaryTree testTree1 = new BinaryTree();

        testTree1.add(1);
        testTree1.root.left = new TreeNode(4);
        testTree1.root.right = new TreeNode(2);
        testTree1.root.left.right = new TreeNode(5);
        testTree1.root.right.left = new TreeNode(1);

        testTree.flip();

        assertEquals(testTree,testTree1);
    }

    @Test
    void flipVoid() {
        BinaryTree testTree = new BinaryTree();

        BinaryTree testTree1 = testTree;

        testTree.flip();

        assertEquals(testTree,testTree1);
    }

    @Test
    void flipOne() {
        BinaryTree testTree = new BinaryTree();
        testTree.add(1);

        BinaryTree testTree1 = testTree;

        testTree.flip();

        assertEquals(testTree,testTree1);
    }
}