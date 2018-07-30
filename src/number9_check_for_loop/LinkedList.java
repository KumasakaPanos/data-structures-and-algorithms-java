package number9_check_for_loop;

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
        current.next = new Node(input);
        this.length++;
    }

    public boolean checkForLoop(){
        Node currentNode1 = this.head;
        Node currentNode2 = this.head;
        while(currentNode2 != null&&currentNode2.next!=null&&currentNode2.next.next!=null){
                currentNode1=currentNode1.next;
                currentNode2=currentNode2.next.next;
                if(currentNode1 == currentNode2||currentNode2.next == currentNode1){
                    return true;
                }
            }
            return false;
    }
}