package number20_flip_binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class flipBinaryTree {
    public TreeNode root;
    private ArrayList<Integer> storage;
    private int size=0;

    public static void main(String[]args){
        flipBinaryTree tree = new flipBinaryTree();
        tree.add(7);
        tree.add(3);
        tree.add(15);
        tree.add(4);
        tree.add(1);
        tree.add(8);
        tree.add(20);

        tree.contains(20);
        tree.min();
    }

    flipBinaryTree(){

    }
    void flipBinaryTree(int input){
        this.root = new TreeNode(input);
    }

    public void add(int input){
        this.size++;
        if(this.root==null){
            this.root = new TreeNode(input);
            return;
        }
        LinkedList<TreeNode> addQuene = new LinkedList<>();
        addQuene.add(this.root);
        boolean placed = false;
        while(addQuene.peek()!=null) {
            TreeNode curr = addQuene.remove();
            TreeNode returned = this._add(input, curr);
            if(returned==null){
                addQuene.add(curr.left);
                addQuene.add(curr.right);
            }else{
                addQuene.clear();
            }
        }
    }

    private TreeNode _add(int input, TreeNode location){
        //if(input<location.data){
        if(location.left==null){
            if(location.left==null){
                location.left = new TreeNode(input);
                return location.left;
            }
        }
        //if(input>=location.data){
        if(location.right==null){
            if(location.right==null){
                location.right = new TreeNode(input);
                return location.right;
            }
        }
        return null;
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
    public void flip(){
        LinkedList<TreeNode> quene = new LinkedList<TreeNode>();

        if(this.root!=null){
            quene.add(root);
        }
        while(!quene.isEmpty()){
            TreeNode currentNode = quene.poll();
            if(currentNode.left != null){
                quene.add(currentNode.left);
            }
            if(currentNode.right != null){
                quene.add(currentNode.right);
            }
            TreeNode temp = currentNode.left;
            currentNode.left=currentNode.right;
            currentNode.right=temp;
        }
    }
}
