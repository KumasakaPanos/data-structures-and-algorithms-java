package number9_check_for_loop;

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
