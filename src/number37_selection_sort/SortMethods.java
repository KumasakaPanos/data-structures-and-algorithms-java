package number37_selection_sort;

import java.util.Random;

public class SortMethods {
    public static double[] randomN(int N){
        double[] returnVal = new double[N];
        Random r = new Random();
        for(int i = 0; i<N; i++){
            returnVal[i]=r.nextDouble();
        }
        return returnVal;
    }

    public static boolean IsSorted(double[] input){
        for(int i=1;i<input.length;i++){
            if(input[i-1]>input[i]){
                return false;
            }
        }
        return true;
    }
}
