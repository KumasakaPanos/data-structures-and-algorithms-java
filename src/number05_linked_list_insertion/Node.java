package number05_linked_list_insertion;

public class Node {
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
