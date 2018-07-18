package day06_k_from_head_linked_list;

public class linkedList{

    public Node head;

    public linkedList(int input){
        this.head = new Node(input);
    }

    public void append(int input){
        Node current = this.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(input, this.head);
    }

    public int kthFromHead(int target){
        Node current = this.head;
        for(int i = 1; i < target; i++){
            current = current.next;
            if(current == null){
                return -1;
            }
        }
        return current.content;
    }
}