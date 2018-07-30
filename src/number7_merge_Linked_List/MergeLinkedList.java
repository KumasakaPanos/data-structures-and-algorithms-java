package number7_merge_Linked_List;

public class MergeLinkedList {
    public static LinkedList mergeLinkedList(LinkedList ll1, LinkedList ll2){
        Node currentNode1 = ll1.head.next;
        Node currentNode2 = ll2.head.next;
        LinkedList ll3 = new LinkedList(ll1.head.content);
        ll3.append(ll2.head.content);
        boolean endsReached = false;
        while(endsReached==false) {
            if (currentNode1 != null) {
                ll3.append(currentNode1.content);
                currentNode1 = currentNode1.next;
            }
            if(currentNode1 == null){
                endsReached = true;
            }
            if (currentNode2 != null) {
                ll3.append(currentNode2.content);
                currentNode2 = currentNode2.next;
            }
            if(currentNode2 == null){
                endsReached = true;
            }
        }
        return ll3;
    }
}
