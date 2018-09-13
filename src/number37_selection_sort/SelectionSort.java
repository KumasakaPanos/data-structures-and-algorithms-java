package number37_selection_sort;

public class SelectionSort {
    public static double[] selectionSort(double[] input){
        for(int i=0;i<input.length;i++){
            int currIndex = i;
            int tempIndex = i;
            double tempMin = Double.MAX_VALUE;

            while(currIndex<input.length){
                if(tempMin>input[currIndex]){
                    tempMin = input[currIndex];
                    tempIndex=currIndex;
                }
                tempMin = Math.min(tempMin,input[currIndex]);
                currIndex++;
            }
            double tempVal = input[i];

            input[i] = tempMin;
            input[tempIndex] = tempVal;
        }
        return input;
    }
}
