package bracket_checker;

public class bracketChecker {
    public static boolean bracketChecker(String input){
        Stack parensStack = new Stack();
        Stack brackStack = new Stack();
        Stack curlyStack = new Stack();
        for(int i = 0;i < input.length();i++){
            char tempChar = input.charAt(i);
            if(tempChar=='{'){curlyStack.push(curlyStack.length);}
            if(tempChar=='('){parensStack.push(parensStack.length);}
            if(tempChar=='['){brackStack.push(brackStack.length);}
            if(tempChar=='}'){if(curlyStack.head==null){
                return false;
            }curlyStack.pop();}
            if(tempChar==')'){if(parensStack.head==null){
                return false;
            }parensStack.pop();}
            if(tempChar==']'){if(brackStack.head==null){
                return false;
            }brackStack.pop();}
        }
        if(curlyStack.length!=1||parensStack.length!=1||brackStack.length!=1){
            return false;
        }
        return true;
    }
}
