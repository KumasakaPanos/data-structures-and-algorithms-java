package day06_k_from_head_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class linkedListTest {

    linkedList testList = new linkedList(4);

    @Test
    void kthFromHead() {
        assertEquals(testList.kthFromHead(1),4);
    }
    @Test
    void kthFromHead1() {
        testList.append(5);
        assertEquals(testList.kthFromHead(2),5);
    }
    @Test
    void kthFromHead2() {
        assertEquals(testList.kthFromHead(2),-1);
    }
}