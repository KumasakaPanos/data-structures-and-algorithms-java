package day06_k_from_head_linked_list;

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
