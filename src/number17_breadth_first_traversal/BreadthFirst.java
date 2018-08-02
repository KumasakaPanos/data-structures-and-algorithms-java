package number17_breadth_first_traversal;

import java.util.*;

public class BreadthFirst {
    public static void main(String[] args) {
    }

    public static String BreadthFirstTraversal(BinaryTree input){
        String returnVal = "";
        LinkedList<TreeNode> nodeStorage = new LinkedList<TreeNode>();
        if(input.root!=null) {
            nodeStorage.add(input.root);
        }
        while(nodeStorage.size()!=0){
            returnVal += BreadthFirstTraversal(nodeStorage.remove(),nodeStorage);
        }
        return returnVal;
    }

    private static String BreadthFirstTraversal(TreeNode current,LinkedList storage){
        System.out.println(current.data);
        if(current.left!=null){
            storage.add(current.left);
        }
        if(current.right!=null) {
            storage.add(current.right);
        }
        return ""+current.data;
    }
}
