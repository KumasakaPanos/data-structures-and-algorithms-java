package day04_array_adjacent_product;

public class ArrayAdjacentProduct {
    public static void main(String[] args) {

    }

    public static int largestProduct(int[][] input){
        int max = -9001;
        for(int row = 0; row < input.length-1;row++){
            for(int col = 0; col<input[row].length-1;col++){
                System.out.println(row+" "+col);
                max = Math.max(returnHighestNeighbor(input,row,col),max);
            }
        }
        return max;
    }

    private static int returnHighestNeighbor(int[][]input, int row, int col){
        int val = input[row][col];
        int localMax = -9999;
        //right
        localMax = Math.max(localMax,val*input[row][col+1]);
        //bottom right
        localMax = Math.max(input[row][col+1]*input[row+1][col+1], localMax);
        //bottom
        localMax = Math.max(localMax,val*input[row+1][col]);
        //bottom left
        if(col!=0){
            localMax = Math.max(localMax,val*input[row][col-1]);
        }
        System.out.println(localMax);
        return localMax;
    }

}
