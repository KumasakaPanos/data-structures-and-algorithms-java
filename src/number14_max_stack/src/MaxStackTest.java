package src;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    Integer testInt0 = 0;
    Integer testInt1 = 1;
    Integer testInt2 = 2;
    Integer testInt3 = 3;
    Integer testInt4 = 4;
    MaxStack testStack = new MaxStack();

    @org.junit.jupiter.api.Test
    void pushMax() {
        testStack.push(2 );
        assertEquals(testStack.peek(),testInt2);
        assertEquals(testStack.getMax(),testInt2);
    }

    @org.junit.jupiter.api.Test
    void pushNotMax() {
        testStack.push(2);
        testStack.push(0);
        assertEquals(testStack.peek(),testInt0);
        assertEquals(testStack.getMax(),testInt2);
    }

    @org.junit.jupiter.api.Test
    void pushNewMax() {
        testStack.push(4 );
        assertEquals(testStack.peek(),testInt4);
        assertEquals(testStack.getMax(),testInt4);
    }

    @org.junit.jupiter.api.Test
    void popMax(){
        testStack.push(0);
        testStack.push(2);
        testStack.push(0);
        testStack.push(4);
        testStack.pop();
        assertEquals(testStack.getMax(),testInt2);
    }

    @org.junit.jupiter.api.Test
    void popNotMax(){
        testStack.push(0);
        testStack.push(2);
        testStack.push(0);
        testStack.pop();
        assertEquals(testStack.getMax(),testInt2);
    }
}