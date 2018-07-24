package quene_with_two_stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueneTest {

    @Test
    void normalEnqueneTest() {
        Quene quene1 = new Quene(1);
        quene1.enquene(2);
        assertEquals(2,quene1.length);
        assertEquals(2,quene1.head.Data);
        assertEquals(1,quene1.head.next.Data);
    }

    @Test
    void largeQueneTest() {
        Quene quene1 = new Quene(1);
        quene1.enquene(2);
        quene1.enquene(3);
        assertEquals(3,quene1.length);
        assertEquals(2,quene1.head.next.Data);
        assertEquals(1,quene1.head.next.next.Data);

    }

    @Test
    void largerQueneTest() {
        Quene quene1 = new Quene(1);
        quene1.enquene(2);
        quene1.enquene(3);
        quene1.enquene(4);
        assertEquals(4,quene1.length);
        assertEquals(2,quene1.head.next.next.Data);
        assertEquals(1,quene1.head.next.next.next.Data);
    }

    @Test
    void normalDequeneTest() {
        Quene quene1 = new Quene(1);
        quene1.enquene(1);

        assertEquals(1,quene1.dequene());
    }

    @Test
    void largerDequeneTest() {
        Quene quene1 = new Quene(1);
        quene1.enquene(2);

        assertEquals(1,quene1.dequene());
        assertEquals(2,quene1.dequene());
    }

    @Test
    void largestDequeneTest() {
        Quene quene1 = new Quene(1);
        quene1.enquene(2);
        quene1.enquene(3);

        assertEquals(1,quene1.dequene());
        assertEquals(2,quene1.dequene());
        assertEquals(3,quene1.dequene());
    }
}