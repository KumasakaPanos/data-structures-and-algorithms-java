package day04_array_adjacent_product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAdjacentProductTest {

    @Test
    void largestProduct() {
        int[][] test = {{1,2,3},{1,2,3},{1,2,3}};
        assertEquals(9, ArrayAdjacentProduct.largestProduct(test));
    }

    @Test
    void largestProduct1(){
        int[][] test = {{5,2,34,5,1},{1,24,453,2,1},{1,32,5,21,24},{52,13,41,243,21},{5,1,2,44,2},{1,2,45,51,44}};
        assertEquals(15402,ArrayAdjacentProduct.largestProduct(test));
    }
}