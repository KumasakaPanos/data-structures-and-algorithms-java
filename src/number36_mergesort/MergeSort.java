package src.number36_mergesort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] input) {
        if (input.length > 1) {
            int mid = midFindGivenLength(input.length);
            int[] stor1 = mergeSort(Arrays.copyOfRange(input, 0, mid));
            int[] stor2 = new int [input.length];
            System.arraycopy(stor1,0,stor2,0,stor1.length);
            System.arraycopy(mergeSort(Arrays.copyOfRange(input,mid,input.length-1)),0,stor2,stor1.length,input.length);
            int[] returnVal = new int [input.length];
            for(int i = 0; i < returnVal.length; i++){
                int minVal = Integer.MAX_VALUE;
                int j = 0;
                while(j<stor2.length){if(stor2[j]<minVal) {minVal = stor2[j];}
                    j++;
                }
                stor2[j]=Integer.MAX_VALUE;
            }
        }
        return input;
    }

    private static Integer midFindGivenLength(Integer input) {
        if (input % 2 == 0) {
            return (input / 2) - 1;
        }
        return Math.floorDiv(input, 2);
    }
}