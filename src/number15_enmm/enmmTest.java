package number15_enmm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class enmmTest {

    @Test
    void normalTest() {
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");
        testList.add("e");
        Assertions.assertEquals("c", enmm.eenieMeenie(2,testList));
    }

    @Test
    void testZeroCatch() {
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");
        testList.add("e");
        Assertions.assertEquals("Please select a non-zero count.", enmm.eenieMeenie(0,testList));
    }

    @Test
    void emptyListTest() {
        List<String> testList = new ArrayList<>();
        Assertions.assertEquals("Please select a list with data.", enmm.eenieMeenie(2,testList));
    }
}