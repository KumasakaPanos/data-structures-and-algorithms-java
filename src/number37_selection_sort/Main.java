package number37_selection_sort;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        double[] checkArray = SortMethods.randomN(10000);
        double[]checkArray2 = checkArray;
        String results = checkArray.length+" entries:";
        long start = System.currentTimeMillis();
        double[] mergeSorted = MergeSort.mergeSort(checkArray);
        long delta = System.currentTimeMillis() - start;
        results += "\nMergeSort took " + delta + " milliseconds.";
        start = System.currentTimeMillis();
        mergeSorted = SelectionSort.selectionSort(checkArray2);
        delta = System.currentTimeMillis() - start;
        results += "\nSelectionSort took " + delta + " milliseconds.\n\n";
        System.out.println("10000 done");

        checkArray = SortMethods.randomN(100000);
        checkArray2 = checkArray;
        results += checkArray.length+" entries:";
        start = System.currentTimeMillis();
        mergeSorted = MergeSort.mergeSort(checkArray);
        delta = System.currentTimeMillis() - start;
        results += "\nMergeSort took " + delta + " milliseconds.";
        start = System.currentTimeMillis();
        mergeSorted = SelectionSort.selectionSort(checkArray2);
        delta = System.currentTimeMillis() - start;
        results += "\nSelectionSort took " + delta + " milliseconds.\n\n";
        System.out.println("100000 done");

        checkArray = SortMethods.randomN(500000);
        checkArray2 = checkArray;
        results += checkArray.length+" entries:";
        start = System.currentTimeMillis();
        mergeSorted = MergeSort.mergeSort(checkArray);
        delta = System.currentTimeMillis() - start;
        results += "\nMergeSort took " + delta + " milliseconds.";
        start = System.currentTimeMillis();
        mergeSorted = SelectionSort.selectionSort(checkArray2);
        delta = System.currentTimeMillis() - start;
        results += "\nSelectionSort took " + delta + " milliseconds.";
        System.out.println("1000000 done");


        try {
            PrintWriter writer = new PrintWriter("output.md ", "UTF-8");
            writer.println(results);
            writer.close();
        }catch(Exception e){System.out.println(e);}
    }
}
