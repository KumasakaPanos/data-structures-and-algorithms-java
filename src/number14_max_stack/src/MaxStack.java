package src;

import java.util.Stack;

public class MaxStack extends Stack<Integer> {
    private Integer max=0;

    public Integer getMax(){
        return max;
    }

    public Integer push(Integer input){
        this.addElement(input);
        if(input>this.max)
        {
            this.max = input;
        }
        return input;
    }

    public Integer pop(){
        int temp = this.remove(this.size()-1);
        if(temp==this.max){
            this.max=0;
            for(int i = 0; i<this.size();i++){
                if(this.get(i)>this.max){
                    this.max=this.get(i);
                }
            }
        }
        return temp;
    }
}