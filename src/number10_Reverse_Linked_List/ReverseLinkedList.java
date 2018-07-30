package number10_Reverse_Linked_List;

public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList input){
        Stack storage = new Stack(input.head.Data);
        input.head = input.head.next;

        while(input.head!=null){
            storage.push(input.head.Data);
            input.head=input.head.next;
        }

        input = new LinkedList(storage.pop());
        while(storage.head!=null){
            input.push(storage.pop());
        }
        return input;
    }
    public static String reverseLinkedList(){
        return ("No linked list given");
    }
}
