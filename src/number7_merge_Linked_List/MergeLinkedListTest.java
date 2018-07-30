package number7_merge_Linked_List;

import static org.junit.jupiter.api.Assertions.*;

class MergeLinkedListTest {

    @org.junit.jupiter.api.Test
    void llMergeTestSameLength() {
        LinkedList ll1 = new LinkedList(4);
        LinkedList ll2 = new LinkedList(3);
        ll1.append(2);
        ll2.append(1);
        LinkedList ll3 = new LinkedList(4);
        ll3.append(3);
        ll3.append(2);
        ll3.append(1);
        LinkedList ll4 = MergeLinkedList.mergeLinkedList(ll1,ll2);
        assertEquals(ll3.head.content,ll4.head.content);
        assertEquals(ll3.head.next.content,ll4.head.next.content);
        assertEquals(ll3.head.next.next.content,ll4.head.next.next.content);
    }

    @org.junit.jupiter.api.Test
    void llMergeTestDifferentLength() {
        LinkedList ll1 = new LinkedList(4);
        LinkedList ll2 = new LinkedList(3);
        ll1.append(2);
        LinkedList ll3 = new LinkedList(4);
        ll3.append(3);
        ll3.append(2);
        LinkedList ll4 = MergeLinkedList.mergeLinkedList(ll1,ll2);
        assertEquals(ll3.head.content,ll4.head.content);
        assertEquals(ll3.head.next.content,ll4.head.next.content);
        assertEquals(ll3.head.next.next.content,ll4.head.next.next.content);
    }

    @org.junit.jupiter.api.Test
    void llMergeDifferentLength2() {
        LinkedList ll1 = new LinkedList(4);
        LinkedList ll2 = new LinkedList(3);
        ll2.append(1);
        LinkedList ll3 = new LinkedList(4);
        ll3.append(3);
        ll3.append(1);
        LinkedList ll4 = MergeLinkedList.mergeLinkedList(ll1,ll2);
        assertEquals(ll3.head.content,ll4.head.content);
        assertEquals(ll3.head.next.content,ll4.head.next.content);
        assertEquals(ll3.head.next.next.content,ll4.head.next.next.content);
    }
}