package number03_BinarySearch_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBinarySearchTest {

    @Test
    void binarySearchBottenbruch() {
        int[] input = {0,3,4,6,8};
        int expected = 1;
        assertEquals(expected,ArrayBinarySearch.binarySearchBottenbruch(input,3));
    }

    @Test
    void binarySearch() {
        int[] input = {0,3,4,6,8};
        int expected = 1;
        assertEquals(expected,ArrayBinarySearch.binarySearch(input,3));
    }

    @Test
    void binarySearchBottenbruch1() {
        int[] input = {0,3,4,6,8};
        int expected = -1;
        assertEquals(expected,ArrayBinarySearch.binarySearchBottenbruch(input,2));
    }

    @Test
    void binarySearch1() {
        int[] input = {0,3,4,6,8};
        int expected = -1;
        assertEquals(expected,ArrayBinarySearch.binarySearch(input,2));
    }

    @Test
    void binarySearchBottenbruch2() {
        int[] input = {0,3,4,6,8};
        int expected = 3;
        assertEquals(expected,ArrayBinarySearch.binarySearchBottenbruch(input,6));
    }

    @Test
    void binarySearch2() {
        int[] input = {0,3,4,6,8};
        int expected = 3;
        assertEquals(expected,ArrayBinarySearch.binarySearch(input,6));
    }
}