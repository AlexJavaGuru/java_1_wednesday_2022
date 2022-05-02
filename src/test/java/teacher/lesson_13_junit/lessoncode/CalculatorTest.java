package teacher.lesson_13_junit.lessoncode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSumOfTwoArguments1() {
        int argumentOne = 20;
        int argumentTwo = 20;
        int actualResult = calculator.sum(argumentOne, argumentTwo);
        assertEquals(40, actualResult, "Sum of 20 and 20 must be 40");
    }

    @Test
    void testSumOfTwoArguments2() {
        int argumentOne = 10;
        int argumentTwo = 20;
        int actualResult = calculator.sum(argumentOne, argumentTwo);
        assertEquals(30, actualResult, "Sum of 10 and 20 must be 30");
    }

    @Test
    void testSumOfTwoArguments3() {
        int argumentOne = 2;
        int argumentTwo = 2;
        int actualResult = calculator.sum(argumentOne, argumentTwo);
        assertEquals(4, actualResult, "Sum of 2 and 2 must be 4");
    }
}