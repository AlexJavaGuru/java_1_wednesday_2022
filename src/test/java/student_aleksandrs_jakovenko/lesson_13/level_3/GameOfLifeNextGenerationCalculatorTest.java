package student_aleksandrs_jakovenko.lesson_13.level_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {

    private GameOfLifeNextGenerationCalculator test;

    @BeforeEach
    void beforeTest() {
        test = new GameOfLifeNextGenerationCalculator();
    }

    @Test
    void testIfLessThan2NeighboursDies() {
        boolean[][] currentGeneration = {
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, true},
        };
        boolean[][] nextGeneration = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }

    @Test
    void testIfMoreThan3NeighboursDies() {
        boolean[][] currentGeneration = {
                {true, true, false, false, false},
                {true, true, false, false, false},
                {false, false, true, true, true},
                {false, false, true, true, true},
                {false, false, true, true, true},
        };
        boolean[][] nextGeneration = {
                {true, true, false, false, false},
                {true, true, false, false, false},
                {false, false, true, true, true},
                {false, false, true, false, true},
                {false, false, true, true, true},
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }

    @Test
    void testIfTwoOrThreeNeighboursStayAlive() {
        boolean[][] currentGeneration = {
                {true, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, true},
        };
        boolean[][] nextGeneration = {
                {true, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }

    @Test
    void testIfThreeAliveNeighboursBecomeAlive() {
        boolean[][] currentGeneration = {
                {true, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] nextGeneration = {
                {true, true, false, false, false},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
}