public class ArrayReverse {
    public static void reverseArray(int[] input){
        int currentHigh = input.length-1;
        int i = 0;
        while(currentHigh>i){
            int currentValue = input[currentHigh];
            input[currentHigh] = input[i];
            input[i] = currentValue;
            currentHigh--;
            i++;
        }
    }
}