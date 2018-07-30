package number02_shift_array_insert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInsertShiftTest {

    @Test
    void arrayInsert() {
        int[] input = {1,2,3,4,5};
        int insertion = 20;
        int[] solution = {1,2,20,3,4,5};
        assertArrayEquals(solution,ArrayInsertShift.ArrayInsert(input,insertion));
    }

    @Test
    void arrayInsert1() {
        int[] input = {};
        int insertion = 20;
        int[] solution = {0};
        assertArrayEquals(solution,ArrayInsertShift.ArrayInsert(input,insertion));
    }

    @Test
    void arrayInsert2() {
        int[] input = {1,2,3,4};
        int insertion = 20;
        int[] solution = {1,2,20,3,4};
        assertArrayEquals(solution,ArrayInsertShift.ArrayInsert(input,insertion));
    }
}