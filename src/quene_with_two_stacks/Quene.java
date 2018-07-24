package quene_with_two_stacks;

public class Quene {
    Stack storage;
    int length;
    Node head;
    Quene(int input){
        this.storage=new Stack(input);
        this.head=this.storage.head;
        this.length = this.storage.length;
    }
    String Quene(){
        System.out.println("Invalid input");
        return("Invalid input");
    }

    public void enquene(int input){
        this.storage.push(input);
        this.head=this.storage.head;
        this.length = this.storage.length;
    }

    public int dequene(){
        Stack tempStack = new Stack(-1);
        while(this.storage.head!=null){
            tempStack.push(this.storage.pop());
        }
        int returnVal = tempStack.pop();
        while(tempStack.head.next!=null){
            this.storage.push(tempStack.pop());
        }
        return returnVal;
    }
}
