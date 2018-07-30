package number12_animal_shelter;

public class Stack {
    Animal head;
    int length;
    Stack(int type){
        this.head = new Animal(type);
        this.length=1;
    }
    Stack(Animal input){
        this.head = input;
        this.length=1;
    }
    public void push(int type){
        Animal newAnimal = new Animal(type);
        this.length++;
        newAnimal.next = this.head;
        this.head= newAnimal;
    }
    public void push(Animal newAnimal){
        this.length++;
        newAnimal.next = this.head;
        this.head= newAnimal;
    }
    public Animal pop(){
        Animal returnAnimal=this.head;
        this.head=this.head.next;
        this.length--;
        return returnAnimal;
    }
}
