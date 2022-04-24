package student_arturs_melnikovs.lesson_13.level_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {

    private GameOfLifeNextGenerationCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new GameOfLifeNextGenerationCalculator();
    }

    @Test
    void testDeadCellsWith3AliveNeighborsBecomeAlive() {
        boolean[][] currentGeneration = {
                {false, true, false, false, false},
                {true, true, false, false, false},
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
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
    @Test
    void testCellsWith2Or3NeighborsStayAliveVar1() {
        boolean[][] currentGeneration = {
                {false, true, false, false, false},
                {true, false, true, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] nextGeneration = {
                {false, true, false, false, false},
                {true, false, true, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }

    @Test
    void testCellsWithMoreThan3NeighborsDieVar1() {
        boolean[][] currentGeneration = {
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
        };
        boolean[][] nextGeneration = {
                {true, false, false, false, true},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {true, false, false, false, true},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
    @Test
    void testCellsWithLessThan2NeighborsDieVar1() {
        boolean[][] currentGeneration = {
                {true, false, false, false, true},
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
                {true, false, false, false, true},
        };
        boolean[][] nextGeneration = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
    @Test
    void testCellsWithLessThan2NeighborsDieVar2() {
        boolean[][] currentGeneration = {
                {false, false, true, false, false},
                {false, false, false, false, false},
                {true, false, false, false, true},
                {false, false, false, false, false},
                {false, false, true, false, false},
        };
        boolean[][] nextGeneration = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
}