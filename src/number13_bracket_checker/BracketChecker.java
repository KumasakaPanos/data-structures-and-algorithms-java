package number13_bracket_checker;

import java.util.Stack;

public class bracketChecker {
    public static boolean bracketChecker(String input) {

        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char tempChar = input.charAt(i);
            if (tempChar == '{') {
                charStack.push(tempChar);
            }
            if (tempChar == '(') {
                charStack.push(tempChar);
            }
            if (tempChar == '[') {
                charStack.push(tempChar);
            }
            if (tempChar == '}') {
                if (charStack.peek() == '{') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
            if (tempChar == ')') {
                if (charStack.peek() == '(') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
            if (tempChar == ']') {
                if (charStack.peek() == '[') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (charStack.empty()) {
            return true;
        }
        return false;
    }
}