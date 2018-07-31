public class FizzBuzzTree {
    public static void fizzBuzzTree(BinaryTree tree){
        if(tree.root==null){
            System.out.print("No data in tree.");
            return;
        }
        String returnStorage = "";
        fizzBuzzTree(tree.root,returnStorage);
    }
    public static void fizzBuzzTree(TreeNode location, String returnStorage){
        if(location.left!=null){
            fizzBuzzTree(location.left,returnStorage);
        }
        if(location.right!=null){
            fizzBuzzTree(location.right,returnStorage);
        }
        if(location.data%3==0){
            System.out.print("Fizz");
            returnStorage+="Fizz";
        }
        if(location.data%5==0){
            System.out.print("Buzz");
            returnStorage+="Buzz";
        }
        System.out.println();
        returnStorage+="\n";
    }
}
