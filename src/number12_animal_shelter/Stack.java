package animal_shelter;

public class Stack {
    animal head;
    int length;
    Stack(int type){
        this.head = new animal(type);
        this.length=1;
    }
    Stack(animal input){
        this.head = input;
        this.length=1;
    }
    public void push(int type){
        animal newAnimal = new animal(type);
        this.length++;
        newAnimal.next = this.head;
        this.head= newAnimal;
    }
    public void push(animal newAnimal){
        this.length++;
        newAnimal.next = this.head;
        this.head= newAnimal;
    }
    public animal pop(){
        animal returnAnimal=this.head;
        this.head=this.head.next;
        this.length--;
        return returnAnimal;
    }
}
