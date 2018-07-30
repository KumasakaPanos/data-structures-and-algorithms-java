package number10_Reverse_Linked_List;

public class Stack {
    Node head;
    Stack(int Data){
        this.head = new Node(Data);
    }
    public void push(int Data){
        Node newNode = new Node(Data);
        newNode.next = this.head;
        this.head=newNode;
    }
    public int pop(){
        int returnValue=this.head.Data;
        this.head=this.head.next;
        return returnValue;
    }
}
