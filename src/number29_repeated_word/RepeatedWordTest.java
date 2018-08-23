package number29_repeated_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedWordTest {

    @Test
    void repeatedWordTrue() {
        assertTrue("the".equals(RepeatedWord.RepeatedWord("The sky above the port was the color of television, tuned to a dead channel.")));
    }
    @Test
    void repeatedWordNoWord(){
        assertEquals(null, RepeatedWord.RepeatedWord("A pink penguin pranced poshly."));
    }
    @Test
    void repeatedWordEmpty(){
        assertEquals(null, RepeatedWord.RepeatedWord(""));
    }
}