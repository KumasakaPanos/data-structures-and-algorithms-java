package number20_flip_binary_tree;

import java.util.*;
import java.util.concurrent.*;


public class BinaryTree {
    public TreeNode root;
    private LinkedList<Integer> storage;
    private int size=0;

    public static void main(String[]args){
        BinaryTree tree = new BinaryTree();
        tree.add(7);
        tree.add(3);
        tree.add(15);
        tree.add(4);
        tree.add(1);
        tree.add(8);
        tree.add(20);

        tree.contains(20);
        tree.min();
        tree.toString();
    }

    BinaryTree(){

    }

    public void flip() {
        LinkedList<TreeNode> forProcessing = new LinkedList<TreeNode>();
        LinkedList<TreeNode> toBeAddedto = new LinkedList<TreeNode>();
        Boolean doneFlipping = false;
        ArrayList<TreeNode> toBeAdded = new ArrayList<TreeNode>();
        forProcessing.add(this.root);
        while (doneFlipping == false) {
            while (forProcessing.size() != 0) {
                TreeNode currNode = forProcessing.remove();
                if(currNode.left!=null){toBeAdded.add(currNode.left);}
                if(currNode.left!=null){toBeAdded.add(currNode.right);}
                toBeAddedto.add(currNode);
            }
            while (toBeAddedto.isEmpty() == false) {
                TreeNode currNode = toBeAddedto.remove();
                currNode.left = toBeAdded.remove(0);
                currNode.right = toBeAdded.remove(0);
                forProcessing.add(currNode.left);
                forProcessing.add(currNode.right);
            }
            if(forProcessing.isEmpty()){
                doneFlipping = true;
            }
        }
    }

    private ArrayList<TreeNode> flip(TreeNode checkedNode, ArrayList<TreeNode> inputList){
        if(checkedNode==null){
            return inputList;
        }
        inputList.add(checkedNode.left);
        inputList.add(checkedNode.right);
        return inputList;
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

    private void inOrder(TreeNode node){
        inOrder(node.left);
        this.storage.add(node.data);
        inOrder(node.right);
        return;
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
}
