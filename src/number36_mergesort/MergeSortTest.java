package src.number36_mergesort;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @org.junit.jupiter.api.Test
    void mergeSort() {
        int[] arr1 = {5,6,4,2,7,3,1};
        int[] arrSort = {1,2,3,4,5,6,7};
        assertEquals(MergeSort.mergeSort(arr1),arrSort);
    }
    void mergeSort1() {
        int[] arr1 = {5};
        int[] arrSort = {5};
        assertEquals(MergeSort.mergeSort(arr1),arrSort);
    }
    void mergeSort2() {
        int[] arr1 = new int[4];
        int[] arrSort = {0,0,0,0};
        assertEquals(MergeSort.mergeSort(arr1),arrSort);
    }
}