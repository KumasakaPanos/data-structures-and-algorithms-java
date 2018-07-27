package mergeLinkedList;

public class linkedList{

    public Node head;

    public int length;

    public linkedList(int input){this.head = new Node(input);
    this.length = 1;}

    public void append(int input){
        this.length++;
        Node current = this.head;
        System.out.println(current.next);
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(input);
    }

    public void insertBefore(int input, int target){
        boolean endFound = false;
        Node targetNode;
        Node currentNode = this.head;
        while(endFound == false){
            if(currentNode.content==target){
                Node tempNode = new Node(input);
                tempNode.next=currentNode;
                this.head=tempNode;
                return;
            }
            if(currentNode.next==null){
                endFound = true;
                return;
            }
            System.out.println(currentNode.content);
            if(currentNode.next.content == target){
                System.out.println("target found.");
                targetNode = currentNode.next;
                currentNode.next = new Node(input,targetNode);
                return;
            }
            currentNode=currentNode.next;
        }
        return;
    }

    public void insertAfter(int input, int target){
        boolean valueFound = false;
        int currentVal = 0;
        Node currentNode = this.head;
        while(valueFound == false){
            if(currentNode.content==target){
                Node tempNode = currentNode.next;
                currentNode.next = new Node(input, tempNode);
            }
            if(currentNode.next==null){
                System.out.println("Not found!");
                return;
            }
            currentNode=currentNode.next;
        }
    }
}