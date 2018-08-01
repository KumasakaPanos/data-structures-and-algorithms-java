import java.util.*;

public class BreadthFirst {
    public static void main(String[] args) {
    }

    public static String Traversal(BinaryTree input){
        String returnVal = "";
        LinkedList<TreeNode> nodeStorage = new LinkedList<TreeNode>();
        if(input.root!=null) {
            nodeStorage.add(input.root);
        }
        while(nodeStorage.size()!=0){
            returnVal += Traversal(nodeStorage.remove(),nodeStorage);
        }
        return returnVal;
    }

    private static String Traversal(TreeNode current,LinkedList storage){
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
