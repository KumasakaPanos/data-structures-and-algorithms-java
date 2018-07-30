package number06_k_from_head_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList testList = new LinkedList(4);

    @Test
    void testForEndValue(){
        assertEquals(4,testList.kthFromEnd(1).content);
    }

    @Test
    void testForSecondValueFromEnd(){testList.append(1);
        assertEquals(4,testList.kthFromEnd(2).content);
    }

    @Test
    void TestForInvalidValue(){
        assertEquals(null,testList.kthFromEnd(2).content);
    }
}