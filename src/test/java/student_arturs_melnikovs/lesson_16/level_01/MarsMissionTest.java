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
    Rover rover1, rover2;
    MarsMission mission;

    @ParameterizedTest
    @MethodSource("commandProviderFor1Rover")
    void test1RoverMove(String command, String expectedResult) {
        mission = new MarsMission(10, 10);
        rover1 = new Rover(5, 5, "N", mission);
        rover2 = new Rover(11,11,"N", mission);
        rover1.move(command, rover2);
        assertEquals(expectedResult, rover1.getLocation());
    }

    @ParameterizedTest
    @MethodSource("commandProviderFor2Rovers")
    void test2RoverNoCollision(String command1, String expected1, String command2, String expected2) {
        mission = new MarsMission(10, 10);
        rover1 = new Rover(5, 5, "N", mission);
        rover2 = new Rover(3,3,"N", mission);
        rover1.move(command1, rover2);
        rover2.move(command2, rover1);
        assertEquals(expected1, rover1.getLocation());
        assertEquals(expected2, rover2.getLocation());
    }

    static Stream<Arguments> commandProviderFor1Rover() {
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

    static Stream<Arguments> commandProviderFor2Rovers() {
        return Stream.of(
                arguments("LMMLMMM", "3 4 S", "MMM", "3 3 N"),
                arguments("", "5 5 N", "MMRMM", "4 5 E"),
                arguments("RRRR", "5 5 N", "LLLL", "3 3 N")
        );
    }
}