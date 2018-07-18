package mergeLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class mergeLinkedListTest {

    @org.junit.jupiter.api.Test
    void mergeLinkedList() {
        linkedList ll1 = new linkedList(4);
        linkedList ll2 = new linkedList(3);
        ll1.append(2);
        ll2.append(1);
        linkedList ll3 = new linkedList(4);
        ll3.append(3);
        ll3.append(2);
        ll3.append(1);
        linkedList ll4 = mergeLinkedList.mergeLinkedList(ll1,ll2);
        assertEquals(ll3.head.content,ll4.head.content);
        assertEquals(ll3.head.next.content,ll4.head.next.content);
        assertEquals(ll3.head.next.next.content,ll4.head.next.next.content);
    }

    @org.junit.jupiter.api.Test
    void mergeLinkedList1() {
        linkedList ll1 = new linkedList(4);
        linkedList ll2 = new linkedList(3);
        ll1.append(2);
        linkedList ll3 = new linkedList(4);
        ll3.append(3);
        ll3.append(2);
        linkedList ll4 = mergeLinkedList.mergeLinkedList(ll1,ll2);
        assertEquals(ll3.head.content,ll4.head.content);
        assertEquals(ll3.head.next.content,ll4.head.next.content);
        assertEquals(ll3.head.next.next.content,ll4.head.next.next.content);
    }

    @org.junit.jupiter.api.Test
    void mergeLinkedList2() {
        linkedList ll1 = new linkedList(4);
        linkedList ll2 = new linkedList(3);
        ll2.append(1);
        linkedList ll3 = new linkedList(4);
        ll3.append(3);
        ll3.append(1);
        linkedList ll4 = mergeLinkedList.mergeLinkedList(ll1,ll2);
        assertEquals(ll3.head.content,ll4.head.content);
        assertEquals(ll3.head.next.content,ll4.head.next.content);
        assertEquals(ll3.head.next.next.content,ll4.head.next.next.content);
    }
}