package number05_linked_list_insertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList testList = new LinkedList(6);

    @Test
    void append() {
        testList.append(3);
        assertEquals(6, testList.head.content);
        assertEquals(3, testList.head.next.content);
        testList.append(9);
        assertEquals(9, testList.head.next.next.content);
    }

    @Test
    void insertBefore() {
        testList.insertBefore(7,6);
        assertEquals(7,testList.head.content);
        testList.insertBefore(7,6);
        assertEquals(7,testList.head.next.content);
        testList.insertBefore(12,6);
        assertEquals(12,testList.head.next.next.content);
    }

    @Test
    void insertAfter() {
        testList.insertAfter(12,6);
        assertEquals(12,testList.head.next.content);
        assertEquals(6,testList.head.content);
        testList.insertAfter(16,12);
        assertEquals(16,testList.head.next.next.content);
    }
}