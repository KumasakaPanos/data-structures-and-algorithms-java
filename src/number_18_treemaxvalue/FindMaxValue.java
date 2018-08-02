package number_18_treemaxvalue;

public class FindMaxValue {
    public static int findMaxValue(BinaryTree input) {
        if(input == null||input.root == null){
            return Integer.MIN_VALUE;
        }
        return findMaxValue(input.root, Integer.MIN_VALUE);
    }

    private static int findMaxValue(TreeNode input, int currMin) {
        if (input == null) {
            return Integer.MIN_VALUE;
        }
        if (currMin < input.data) {
            currMin = input.data;
        }
        currMin = Integer.max(currMin, findMaxValue(input.left, currMin));
        currMin = Integer.max(currMin, findMaxValue(input.right, currMin));
        return currMin;
    }
}