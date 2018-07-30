package number10_Reverse_Linked_List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void normalTest() {
        LinkedList list1 = new LinkedList(1);
        list1.push(2);
        list1.push(3);

        LinkedList list2 = new LinkedList(3);
        list2.push(2);
        list2.push(1);

        list1=ReverseLinkedList.reverseLinkedList(list1);
        for(int i = 0; i<list1.length; i++){
            Node currentNode=list1.head;
            Node currentNode1=list2.head;
            for(int j = 0; j<i;j++){
                currentNode = currentNode.next;
                currentNode1 = currentNode1.next;
            }
            assertEquals(currentNode1.Data,currentNode.Data);
        }
    }
    @Test
    void oneDataTest(){
        LinkedList list1 = new LinkedList(2);
        LinkedList list2 = new LinkedList(2);
        list1=ReverseLinkedList.reverseLinkedList(list1);
        for(int i = 0; i<list1.length; i++){
            Node currentNode=list1.head;
            Node currentNode1=list2.head;
            for(int j = 0; j<i;j++){
                currentNode = currentNode.next;
                currentNode1 = currentNode1.next;
            }
            assertEquals(currentNode1.Data,currentNode.Data);
        }
    }
    @Test
    void nullEntryTest(){
        assertEquals("No linked list given",ReverseLinkedList.reverseLinkedList());
    }
}