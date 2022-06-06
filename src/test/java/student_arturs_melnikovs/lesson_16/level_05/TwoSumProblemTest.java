package student_arturs_melnikovs.lesson_16.level_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoSumProblemTest {
    TwoSumProblem problem;

    @BeforeEach
    void setUp() {
        problem = new TwoSumProblem();
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testProblemSolution(int[] numbers, int target, int[] expected) {
        int[] actual = problem.findIndices(numbers, target);
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                arguments(new int[]{1, 2, 5, 8}, 7, new int[]{1, 2}),
                arguments(new int[]{1, 2, 5, 8}, 3, new int[]{0, 1}),
                arguments(new int[]{1, 2, 5, 8}, 6, new int[]{0, 2}),
                arguments(new int[]{1, 2, 5, 8}, 9, new int[]{0, 3}),
                arguments(new int[]{1, 2, 5, 8}, 13, new int[]{2, 3}),
                arguments(new int[]{1, 2, 5, 8}, 10, new int[]{1, 3}),
                arguments(new int[]{1, 2, 5, 8}, 15, null)
        );
    }
}