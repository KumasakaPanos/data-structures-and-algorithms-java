package number15_enmm;

import java.util.List;

public class enmm {
    public static String eenieMeenie(int n, List<String> List){
        if(n==0){
            return "Please select a non-zero count.";
        }
        if(List.size()==0){
            return "Please select a list with data.";
        }
        int location = -1;
        while(List.size()>1){
            location=(n+location)%List.size();
            List.remove(location);
        }
        return List.get(0);
    }
}
