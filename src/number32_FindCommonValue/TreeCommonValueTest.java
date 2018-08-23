package number32_FindCommonValue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static number32_FindCommonValue.TreeCommonValue.commonValue;
import static org.junit.jupiter.api.Assertions.*;

class TreeCommonValueTest {

    BinaryTree tree1 = new BinaryTree();
    BinaryTree tree2 = new BinaryTree();
    List checkAgainst = new ArrayList<>();

    @Test
    void commonValueContent() {tree1.add(0);
        tree1.add(1);
        tree1.add(2);
        checkAgainst.add(0);
        checkAgainst.add(1);
        checkAgainst.add(2);
        assertArrayEquals(checkAgainst.toArray(),TreeCommonValue.commonValue(tree1,tree1).toArray());
    }
    @Test
    void commonValueNoContent(){
        assertArrayEquals(checkAgainst.toArray(),TreeCommonValue.commonValue(tree1,tree2).toArray());
    }
    @Test
    void commonValueNotContent(){tree1.add(0);
        tree1.add(1);
        tree1.add(2);
        tree2.add(4);
        assertArrayEquals(checkAgainst.toArray(),TreeCommonValue.commonValue(tree1,tree2).toArray());
    }
}