package number37_selection_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void selectionSortTestDefault() {
        double[] testScrambled = {5,6,3,1,2,4,0,4};
        double[] testSorted = {0,1,2,3,4,4,5,6};
        assertArrayEquals(testSorted,SelectionSort.selectionSort(testScrambled));
    }
    @Test
    void selectionSortTestLength1Array(){
        double[] testScrambled = {5};
        double[] testSorted = {5};
        assertArrayEquals(testSorted,SelectionSort.selectionSort(testScrambled));
    }
    @Test
    void selectionSortTestEmptyArray(){
        double[] testScrambled = {};
        double[] testSorted = {};
        assertArrayEquals(testSorted,SelectionSort.selectionSort(testScrambled));
    }
    @Test
    void selectionSortSorted(){
        double[] testSorted = {0,1,2,3,4};
        assertArrayEquals(testSorted,SelectionSort.selectionSort(testSorted));
    }
}