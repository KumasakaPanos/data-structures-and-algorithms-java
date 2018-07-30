package number02_shift_array_insert;

public class ArrayInsertShift {
    public static int[] ArrayInsert(int[] input, int insert){
        int[] output = new int[input.length+1];
        int midpoint = (int) Math.floor(((double) input.length)/2);
        int position = 0;
        for(int i = 0; i < input.length; i++){
            if(position == midpoint){
                output[position] = insert;
                position++;
            }
            output[position] = input[i];
            position++;
        }
        return output;
    }
}
