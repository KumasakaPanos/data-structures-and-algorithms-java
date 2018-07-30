package number03_BinarySearch_Array;

public class ArrayBinarySearch {
    public static void main(String[] args) {
//        int[] numbers = intergerify(args);
//        binarySearchBottenbruch()
    }

//    public static int[] intergerify(String[] input){
//        int[] integers = new int[input.length];
//        for(int i = 0; i < input.length; i++){
//           integers[i] = Integer.parseInt(input[i]);
//        }
//        return integers;
//    }

    public static int binarySearchBottenbruch(int[] array, int target){
        int L = 0;
        int R = array.length-1;
        int M = -1;
        while(L<R) {
            M = (int) Math.ceil((double)(L+R)/2);
            System.out.println("M: " + M + "\nR: " + R + "\nL: " + L);
            if(array[M]>target){
                System.out.println("M>target\n");
                R = M-1;
            }else if(array[M]<=target){
                System.out.println("M<target\n");
                L = M;
            }
            System.out.println("--SECOND LOG--:\nM: " + M + "\nR: " + R + "\nL: " + L + "\n-------------------");
        }
        System.out.println(M+" "+array[M]+" "+target);
        if(array[M]==target){
            return M;
        }
        M = -1;
        return M;
    }

    public static int binarySearch(int[] array, int target){
        int L = 0;
        int R = array.length -1;
        while(L<=R){
            int M = (int) Math.floor((double)(L+R));
            System.out.println("M: " + M + "\nR: " + R + "\nL: " + L);
            if(array[M]<target){
                L = M+1;
            }else if(array[M]>target){
                R = M-1;
            }else{
                return M;
            }
            System.out.println("--SECOND LOG--:\nM: " + M + "\nR: " + R + "\nL: " + L + "\n");
        }
        int M = -1;
        return M;
    }
}
