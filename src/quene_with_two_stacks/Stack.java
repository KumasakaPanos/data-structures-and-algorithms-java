package quene_with_two_stacks;

public class Stack {
    Node head;
    int length;
    Stack(int Data){
        this.head = new Node(Data);
        this.length=1;
    }
    public void push(int Data){
        Node newNode = new Node(Data);
        this.length++;
        newNode.next = this.head;
        this.head=newNode;
    }
    public int pop(){
        int returnValue=this.head.Data;
        this.head=this.head.next;
        this.length--;
        return returnValue;
    }
}
