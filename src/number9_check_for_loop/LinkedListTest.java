package number9_check_for_loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void checkForLoopFalse() {
        LinkedList testList = new LinkedList(4);
        testList.append(5);
        assertEquals(false,testList.checkForLoop());
    }

    @Test
    void checkForLoopTrue(){
        LinkedList testList1 = new LinkedList(4);
        testList1.append(5);
        testList1.head.next.next=testList1.head;
        assertEquals(true, testList1.checkForLoop());
    }

    @Test
    void checkForLoopOneElement(){
        LinkedList testList = new LinkedList(4);
        assertEquals(testList.checkForLoop(),false);
    }
}