package number_19_identical;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class BinaryTree {
    public TreeNode root;
    private ArrayList<Integer> storage;
    private int size=0;

    public static void main(String[]args){
    }

    BinaryTree(){

    }
    BinaryTree(int input){
        this.root = new TreeNode(input);
    }

    public void add(int input){
        this.size++;
        if(this.root==null){
            this.root = new TreeNode(input);
            return;
        }
        this.add(input, this.root);
    }

    private void add(int input, TreeNode location){
        if(input>=location.data){
            if(location.right==null){
                location.right = new TreeNode(input);
                return;
            }
            add(input,location.right);
        }
        if(input<location.data){
            if(location.left==null){
                location.left = new TreeNode(input);
                return;
            }
            add(input,location.left);
        }
    }

    public String toString(){
        if(this.root==null){
            return "";
        }
        String toReturn = "";
        for(ListIterator<String> iterator = this.inOrder().listIterator(); iterator.hasNext();){
            toReturn+=iterator.next();
        }
        return toReturn;
    }
    public int size(){
        return this.size;
    }

    public int min(){
        int min = Integer.MAX_VALUE;
        for(ListIterator<Integer> iterator = this.inOrder().listIterator(); iterator.hasNext();){
            int currentVal = iterator.next();
            if(min>currentVal){
                min=currentVal;
            }
        }
        return min;
    }

    public boolean contains(int val){
        return contains(val, this.root);
    }

    public boolean contains(int val, TreeNode location){
        if(location.right.data==val){
            return true;
        }
        if(location.left.data==val){
            return true;
        }
        if(val>=location.data){
            if(location.right==null){
                return false;
            }
            return contains(val,location.right);
        }else{
            if(location.left==null){
                return false;
            }
            return contains(val, location.left);
        }
    }

    public List inOrder(){
        inOrder(this.root);
        return this.storage;
    }

    private ArrayList<Integer> inOrder(TreeNode node){
        inOrder(node.left);
        this.storage.add(node.data);
        inOrder(node.right);
        return this.storage;
    }

    public List preOrder(){
        preorder(this.root);
        return this.storage;
    }

    private void preorder(TreeNode node){
        this.storage.add(node.data);
        preorder(node.left);
        preorder(node.right);
        return;
    }

    public List postOrder(){
        postOrder(this.root);
        return this.storage;
    }

    private void postOrder(TreeNode node){
        postOrder(node.left);
        postOrder(node.right);
        this.storage.add(node.data);
    }

    public Boolean identical(BinaryTree tree1){
        Stack<TreeNode> List1 = new Stack<TreeNode>();
        Stack<TreeNode> List2 = new Stack<TreeNode>();

        if(tree1.root == null||this.root == null){

            if(tree1.root == null && this.root == null){
                return true;
            }
            return false;
        }

        List1.add(tree1.root);
        List2.add(this.root);

        while(!List1.isEmpty()||!List2.isEmpty()){

            if(!List1.isEmpty()&&List2.isEmpty()||List1.isEmpty()&&!List2.isEmpty()){
                return false;
            }

            TreeNode tempNode1 = List1.pop();
            TreeNode tempNode2 = List2.pop();

            if(!identicalChecker(tempNode1,tempNode2)){
                return false;
            }
            addChildren(tempNode1,List1);
            addChildren(tempNode2,List2);
        }

        return true;
    }

    private static void addChildren(TreeNode node,Stack<TreeNode> listToSave){
        if(node.left!=null){listToSave.push(node.left);}
        if(node.right!=null){listToSave.push(node.right);}
    }

    private static Boolean identicalChecker(TreeNode node1, TreeNode node2){
        if(node1.data != node2.data){
            return false;
        }
        if(node1.left != null && node2.left != null) {
            if (node1.left.data != node2.left.data) {
                return false;
            }
        }
        if(node1.right != null && node2.right != null) {
            if (node1.right.data != node2.right.data) {
                return false;
            }
        }
        return true;
    }
}
