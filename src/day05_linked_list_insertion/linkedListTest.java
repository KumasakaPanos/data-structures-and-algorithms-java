package day05_linked_list_insertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class linkedListTest {

    linkedList testList = new linkedList(6);

    @Test
    void append() {
        System.out.println(testList.head.content);
        testList.append(3);
        System.out.println(testList.head.next.content);
        assertEquals(3, testList.head.content);
    }

    @Test
    void insertBefore() {
        testList.insertBefore(7,6);
        assertEquals(7,testList.head.content);
    }

    @Test
    void insertAfter() {
        testList.insertAfter(12,6);
        assertEquals(12,testList.head.next.content);
    }
}