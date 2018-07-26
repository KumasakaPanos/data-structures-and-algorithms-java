package bracket_checker;

public class Stack {
    Node head;
    int length;
    Stack(int Data){
        this.head = new Node(Data);
        this.length=1;
    }
    Stack(){this.length=0;
    }
    public void push(int Data){
        if(this.head==null){
            Node newNode = new Node(Data);
            this.length++;
            this.head=newNode;
        }
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
