package number12_animal_shelter;

public class AnimalShelter {
    Stack storage;
    int population;
    AnimalShelter(int type){
        this.storage=new Stack(type);
        this.population = this.storage.length;
    }
    String Quene(){
        System.out.println("Invalid input");
        return("Invalid input");
    }

    public void input(int input){
        if(input==1||input==0) {
            this.storage.push(input);
            this.population = this.storage.length;
        }else{
            System.out.println("Input of 1 for dog or 0 for cat only please.");
        }
    }

    public Animal adopt(int type){
        Stack tempStor = new Stack(this.storage.pop());
        Animal returnVal = null;
        Animal tempAnimal;
        Boolean found = false;
        while(this.storage.head!=null){
            tempStor.push(this.storage.pop());
        }
        while(tempStor.head!=null){
            tempAnimal=tempStor.pop();
            if(!found){
                if(tempAnimal.Type==type){
                    returnVal=tempAnimal;
                    found=true;
                }
            }
            this.storage.push(tempAnimal);
        }
        return returnVal;
    }
    public Animal adopt(){
        Stack tempStor = new Stack(this.storage.pop());
        Animal returnVal = null;
        Animal tempAnimal;
        Boolean found = false;
        while(this.storage.head!=null){
            tempStor.push(this.storage.pop());
        }
        while(tempStor.head!=null){
            tempAnimal=tempStor.pop();
            if(!found){
                    returnVal=tempAnimal;
                    found=true;
            }
            this.storage.push(tempAnimal);
        }
        return returnVal;
    }
}
