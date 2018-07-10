import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReverseTest {

    @org.junit.jupiter.api.Test
    void arrayReverse() {
        int[] numbers = {0,1,2,3,4};
        ArrayReverse.reverseArray(numbers);
        int[] expectedNumbers = {4,3,2,1,0};
        assertArrayEquals(expectedNumbers,numbers);
    }

    @org.junit.jupiter.api.Test
    void arrayReverse1() {
        int[] numbers = {2,4,6};
        ArrayReverse.reverseArray(numbers);
        int[] expectedNumbers = {6,4,2};
        assertArrayEquals(expectedNumbers,numbers);
    }

    @org.junit.jupiter.api.Test
    void arrayReverse2() {
        int[] numbers = {9000,3000000,22,11,33,22,55};
        ArrayReverse.reverseArray(numbers);
        int[] expectedNumbers = {55,22,33,11,22,3000000,9000};
        assertArrayEquals(expectedNumbers,numbers);
    }


}