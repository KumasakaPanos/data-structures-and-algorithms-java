package array_pop;

public class ArrayShift {
    public static int[] array_shift(int[] input){
        int[] output = new int[input.length-1];
        int i = 0;
        while(output[output.length-1]==0){
            output[i] = input[i];
            i++;
        }
        return output;
    }
}
