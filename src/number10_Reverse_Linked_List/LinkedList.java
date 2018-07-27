package number10_Reverse_Linked_List;

public class linkedList {
    Node head;
    int length;
    linkedList(int data){
        this.head = new Node(data);
        this.length=1;
    }
    public void push(int data){
        this.length++;
        Node currentNode = this.head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=new Node(data);
    }
}
