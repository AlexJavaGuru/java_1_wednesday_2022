package student_arturs_melnikovs.lesson_16.level_01;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MarsMissionTest {
    Rover rover;
    MarsMission mission;

    @BeforeEach
    void setUp() {
        mission = new MarsMission(10, 10);
        rover = new Rover(5, 5, "N", mission);
    }
    @ParameterizedTest
    @MethodSource("commandProvider")
    void testMove(String command, String expectedResult) {
        rover.move(command);
        assertEquals(expectedResult, rover.getLocation());
    }


    static Stream<Arguments> commandProvider() {
        return Stream.of(
                arguments("M", "5 6 N"),
                arguments("L", "5 5 W"),
                arguments("R", "5 5 E"),
                arguments("LRM", "5 6 N"),
                arguments("LLLLM", "5 6 N"),
                arguments("RRRRM", "5 6 N"),
                arguments("MLLLL", "5 6 N"),
                arguments("MRRRR", "5 6 N"),
                arguments("LL", "5 5 S"),
                arguments("LLL", "5 5 E"),
                arguments("RR", "5 5 S"),
                arguments("RRR", "5 5 W"),
                arguments("MMLMMRMMMLL", "3 10 S"),
                arguments("RMRM", "6 4 S"),
                arguments("MMMMMMMM", "5 10 N"),
                arguments("MMMMMMMMRM", "6 10 E"),
                arguments("RRMMMMMM", "5 0 S"),
                arguments("RRMMMMMMR", "5 0 W"),
                arguments("LMMMMMMM", "0 5 W"),
                arguments("RMMMMMMM", "10 5 E")
        );
    }

}