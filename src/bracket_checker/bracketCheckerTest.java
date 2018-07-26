package bracket_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bracketCheckerTest {

    @Test
    void bracketCheckerFalse() {
        String input = "{([])}";
        assertEquals(true,bracketChecker.bracketChecker(input));
    }

    @Test
    void bracketCheckerBrack() {
        String input = "[)";
        assertEquals(false,bracketChecker.bracketChecker(input));
    }

    @Test
    void bracketCheckerParens() {
        String input = "(]";
        assertEquals(false,bracketChecker.bracketChecker(input));
    }

    @Test
    void bracketCheckerCurly() {
        String input = "{]";
        assertEquals(false,bracketChecker.bracketChecker(input));
    }
}