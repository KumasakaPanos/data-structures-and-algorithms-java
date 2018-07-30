package number06_k_from_head_linked_list;

public class LinkedList {

    public int length;
    public Node head;
    public LinkedList(int input){
        this.head = new Node(input);
        this.length = 1;
    }

    public void append(int input){
        Node current = this.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(input, this.head);
        this.length++;
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

    public Node kthFromEnd(int target){
        Node current = this.head;
        if(target >= this.length){
            System.out.println("Invalid target.");
            return null;
        }

        for(int i = 0; i < this.length-target; i++){
            current=current.next;
        }

        return current;
    }
}