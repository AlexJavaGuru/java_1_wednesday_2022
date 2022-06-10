package student_arturs_melnikovs.lesson_15.level_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class QuadraticEqTest {

    QuadraticEq quadraticEq;

    @BeforeEach
    void setUp() {
        quadraticEq = new QuadraticEq();
    }

    @Test
    void testCalcPositiveDiscriminant() {
        String actual = quadraticEq.calc(5,6,1);
        String expected = "x1 = -1.0, x2 = -0.2";
        assertEquals(expected, actual);
    }

    @Test
    void testCalcNegativeDiscriminant() {
        String actual = quadraticEq.calc(2, 2, 1);
        String expected = "Equation has no roots";
        assertEquals(expected, actual);
    }

    @Test
    void testCalcDiscriminantEqualsZero() {
        String actual = quadraticEq.calc(1, 2, 1);
        String expected = "x = -1.0";
        assertEquals(expected, actual);
    }
}