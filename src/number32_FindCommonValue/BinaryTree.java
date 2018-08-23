package number32_FindCommonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class BinaryTree {
    public TreeNode root;
    public ArrayList<Integer> storage;
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

//    public String toString(){
//        String toReturn = "";
//        for(ListIterator<String> iterator = this.inOrder().listIterator(); iterator.hasNext();){
//            toReturn+=iterator.next();
//        }
//        return toReturn;
//    }
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
        if(node!=null) {
            inOrder(node.left);
            this.storage.add(node.data);
            inOrder(node.right);
        }
        return;
    }

    public List preOrder(){
        this.storage = new ArrayList<>();
        preorder(this.root);
        return this.storage;
    }

    private void preorder(TreeNode node){
        if(node==null){return;}
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
