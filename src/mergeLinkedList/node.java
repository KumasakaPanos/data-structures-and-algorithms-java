package mergeLinkedList;

public class node {
    public int content;
    public Node next;
    public Node(int input){
        this.content = input;
    }
    public Node(int input, Node Next){
        this.content = input;
        this.next = Next;
    }

}
