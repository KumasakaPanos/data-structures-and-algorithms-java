package number20_flip_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class flipBinaryTreeTest {

    @Test
    void invertTree() {
        flipBinaryTree testTree = new flip();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        testTree.add(4);
        testTree.flip();
        assertEquals(testTree.root.data,1);
        assertEquals(testTree.root.right.data,2);
        assertEquals(testTree.root.left.data,3);
        assertEquals(testTree.root.right.right.data,4);
    }
    @Test
    void invertTreeNull() {
        flipBinaryTree testTree = new flip();

        testTree.flip();
        assertEquals(testTree.root,null);
    }
    @Test
    void invertTreeSymmetrical() {
        flipBinaryTree testTree = new flip();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        testTree.add(4);
        testTree.add(4);
        testTree.flip();
        assertEquals(testTree.root.data,1);
        assertEquals(testTree.root.right.data,2);
        assertEquals(testTree.root.left.data,3);
        assertEquals(testTree.root.right.right.data,4);
        assertEquals(testTree.root.right.left.data,4);
    }
}