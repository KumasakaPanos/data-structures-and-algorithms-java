package day01_reverse_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReverseTest {

    @Test
    void reverseArray() {
        int[] numbers = {0,1,2,3,4};
        day01_reverse_array.src.ArrayReverse.reverseArray(numbers);
        int[] expectedNumbers = {4,3,2,1,0};
        assertArrayEquals(expectedNumbers,numbers);
    }
}