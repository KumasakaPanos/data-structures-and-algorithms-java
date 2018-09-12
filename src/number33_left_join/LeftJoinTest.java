package number33_left_join;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @org.junit.jupiter.api.Test
    void leftJoin() {
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();
        map1.put("fun","enjoyable");
        map1.put("hot","warm");
        map1.put("cold","frigid");

        map2.put("cold","hot");
        map2.put("enjoyable","boring");
        map2.put("humid","dry");

        String[] entry3 = {"fun","enjoyable","boring"};
        String[] entry2 = {"hot","warm",null};
        String[] entry1 = {"cold","frigid",null};
        String[][] solution = {entry1,entry2,entry3};

        String[][] recieved = LeftJoin.LeftJoin(map1,map2);

        assertArrayEquals(solution,LeftJoin.LeftJoin(map1,map2));
    }

    @org.junit.jupiter.api.Test
    void leftJoinNull1(){
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("cold","hot");
        map2.put("enjoyable","boring");
        map2.put("humid","dry");
        assertArrayEquals(null,LeftJoin.LeftJoin(map1,map2));
    }

    @org.junit.jupiter.api.Test
    void leftJoinNull2(){
        HashMap map1 = new HashMap();
        map1.put("fun","enjoyable");
        map1.put("hot","warm");
        map1.put("cold","frigid");

        String[] entry3 = {"fun","enjoyable",null};
        String[] entry2 = {"hot","warm",null};
        String[] entry1 = {"cold","frigid",null};

        HashMap map2 = new HashMap();

        String[][] solution = {entry1,entry2,entry3};

        assertArrayEquals(solution,LeftJoin.LeftJoin(map1,map2));
    }
}