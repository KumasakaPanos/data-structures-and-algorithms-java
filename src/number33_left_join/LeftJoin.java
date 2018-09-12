package number33_left_join;

import java.util.HashMap;

public class LeftJoin {
    public static String[][] LeftJoin(HashMap<String,String> table1,HashMap<String,String> table2){
        if(table1==null||table2==null){
            return null;
        }
        if(table1.size()==0){
            return null;
        }
        String[][] returnVal = new String[table1.keySet().size()][3];
        int currString = 0;
        for(String key : table1.keySet()) {
            String[] toAdd = new String[3];
            toAdd[0] = key;
            toAdd[1] = table1.get(key);
            if (table2.get(toAdd[1]) != null) {
                toAdd[2] = table2.get(toAdd[1]);
            }else{
                toAdd[2]=null;
            }
            returnVal[currString]=toAdd;
            currString++;
        }
        return returnVal;
    }
}
