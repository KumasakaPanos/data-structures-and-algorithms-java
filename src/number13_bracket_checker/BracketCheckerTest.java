package number13_bracket_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketCheckerTest {

    @Test
    void bracketCheckerFalse() {
        String input = "{([])}";
        assertEquals(true,BracketChecker.bracketChecker(input));
    }

    @Test
    void bracketCheckerBrack() {
        String input = "[)";
        assertEquals(false,BracketChecker.bracketChecker(input));
    }

    @Test
    void bracketCheckerParens() {
        String input = "(]";
        assertEquals(false,BracketChecker.bracketChecker(input));
    }

    @Test
    void bracketCheckerCurly() {
        String input = "{]";
        assertEquals(false,BracketChecker.bracketChecker(input));
    }
}