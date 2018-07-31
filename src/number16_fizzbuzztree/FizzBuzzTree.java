public class FizzBuzzTree {
    public static String fizzBuzzTree(BinaryTree tree){
        if(tree.root==null){
            System.out.print("No data in tree.");
            return "No data in tree.";
        }
        return fizzBuzzTree(tree.root);
    }
    public static String fizzBuzzTree(TreeNode location){
        String returnStorage;
        if(location==null){
            return "";
        }
        returnStorage = fizzBuzzTree(location.left);
        returnStorage += fizzBuzzTree(location.right);
        if(location.data%3==0){
            System.out.print("Fizz");
            returnStorage+="Fizz";
        }
        if(location.data%5==0){
            System.out.print("Buzz");
            returnStorage+="Buzz";
        }
        if(returnStorage==""){
            returnStorage+=location.data;
            System.out.print(location.data);
        }
        System.out.println();
        returnStorage+="\n";
        return returnStorage;
    }
}
