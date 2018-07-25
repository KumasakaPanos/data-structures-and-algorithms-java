package animal_shelter;

public class animalShelter {
    Stack storage;
    int population;
    animalShelter(int type){
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

    public animal adopt(int type){
        Stack tempStor = new Stack(this.storage.pop());
        animal returnVal = null;
        animal tempAnimal;
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
    public animal adopt(){
        Stack tempStor = new Stack(this.storage.pop());
        animal returnVal = null;
        animal tempAnimal;
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
