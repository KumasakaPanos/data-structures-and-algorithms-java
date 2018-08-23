package number32_FindCommonValue;

import java.util.ArrayList;
import java.util.List;

public class TreeCommonValue {
    public static List commonValue(BinaryTree tree1, BinaryTree tree2){
        List Tree1Content = tree1.preOrder();
        List Tree2Content = tree2.preOrder();
        List returnVal = new ArrayList<String>();
        if(Tree1Content.isEmpty()||Tree2Content.isEmpty()) {
            return returnVal;
        }
        for(Object currString : Tree1Content){
            if(Tree2Content.contains(currString)){
                returnVal.add(currString);
            }
        }
        return returnVal;
    }
}
