package student_arturs_melnikovs.lesson_13.level_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void testEmptyStringReturnsZero() {
        String testString = "";
        int actual = calculator.add(testString);
        assertEquals(0, actual);
    }

    @Test
    void testOnePlusTwoReturnThree() {
        String string = "1, 2";
        int actual = calculator.add(string);
        assertEquals(3, actual);
    }

    @Test
    void testSingleNumberReturnItself() {
        String string = "5";
        int actual = calculator.add(string);
        assertEquals(5, actual);
    }

    @Test
    void testTenPlusTenReturnsTwenty() {
        String string = "10, 10";
        int actual = calculator.add(string);
        assertEquals(20, actual);
    }

    @Test
    void testHundredPlusOne() {
        String string = "100, 1";
        int actual = calculator.add(string);
        assertEquals(101, actual);
    }

    @Test
    void testWithOtherCharacters() {
        String string = "A!df100,dsa sd 1sd";
        int actual = calculator.add(string);
        assertEquals(101, actual);
    }
}