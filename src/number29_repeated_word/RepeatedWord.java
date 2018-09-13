package number29_repeated_word;

import java.util.HashMap;

public class RepeatedWord {
    public static String RepeatedWord(String input){
        HashMap wordMap = new HashMap<String,String>();
        String[] inputArray = input.split("[^'a-zA-Z0-9_]");
        for(String currString : inputArray){
            currString=currString.toLowerCase();
            if(wordMap.containsValue(currString)){
                return currString;
            }
            wordMap.put(currString,currString);
        }
    return null;
    }
}
