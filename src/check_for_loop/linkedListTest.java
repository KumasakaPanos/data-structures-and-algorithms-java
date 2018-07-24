package check_for_loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class linkedListTest {

    @Test
    void checkForLoopFalse() {
        linkedList testList = new linkedList(4);
        testList.append(5);
        assertEquals(false,testList.checkForLoop());
    }

    @Test
    void checkForLoopTrue(){
        linkedList testList1 = new linkedList(4);
        testList1.append(5);
        testList1.head.next.next=testList1.head;
        assertEquals(true, testList1.checkForLoop());
    }

    @Test
    void checkForLoopOneElement(){
        linkedList testList = new linkedList(4);
        assertEquals(testList.checkForLoop(),false);
    }
}