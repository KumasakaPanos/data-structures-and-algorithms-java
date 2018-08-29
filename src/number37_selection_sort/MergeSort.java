package number37_selection_sort;

import java.util.Arrays;

public class MergeSort {
    public static double[] mergeSort(double[] input) {
        if (input.length > 1) {
            int mid = midFindGivenLength(input.length);
            double[] stor1 = mergeSort(Arrays.copyOfRange(input, 0, mid));
            double[] stor2 = mergeSort(Arrays.copyOfRange(input,mid,input.length));
            double[] returnVal = new double [input.length];
            int j = 0;
            int k = 0;
            for(int i = 0; i < returnVal.length; i++){
                double minVal = Integer.MAX_VALUE;
                if(stor1[j]<stor2[k]){
                    returnVal[i]=stor1[j];
                    minVal=stor1[j];
                    j++;
                    if(j>stor1.length-1){
                        j--;
                        stor1[j]=Integer.MAX_VALUE;
                    }
                }else if(stor2[k]<stor1[j]){
                    returnVal[i]=stor2[k];
                    k++;
                    if(k>stor2.length-1){
                        k--;
                        stor2[k]=Integer.MAX_VALUE;
                    }
                }
            }
            return returnVal;
        }
        return input;
    }

    private static Integer midFindGivenLength(Integer input) {
        if (input % 2 == 0) {
            return (input / 2);
        }
        return Math.floorDiv(input, 2);
    }
}