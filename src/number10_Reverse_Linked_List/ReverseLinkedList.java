package number10_Reverse_Linked_List;

public class reverseLinkedList {
    public static linkedList reverseLinkedList(linkedList input){
        Stack storage = new Stack(input.head.Data);
        input.head = input.head.next;

        while(input.head!=null){
            storage.push(input.head.Data);
            input.head=input.head.next;
        }

        input = new linkedList(storage.pop());
        while(storage.head!=null){
            input.push(storage.pop());
        }
        return input;
    }
    public static String reverseLinkedList(){
        return ("No linked list given");
    }
}
