package day02_array_shift;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @org.junit.jupiter.api.Test
    void array_shift() {
        int[] example = {5,67,3,42,1};
        int[] fodder = {5,67,3,42,1,0};
        int[] example2 = ArrayShift.array_shift(fodder);
        assertArrayEquals(example,example2);
    }
}