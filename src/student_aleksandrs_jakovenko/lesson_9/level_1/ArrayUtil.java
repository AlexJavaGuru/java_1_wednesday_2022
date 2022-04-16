package student_aleksandrs_jakovenko.lesson_9.level_1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public interface ArrayUtil {

    int[] createArray(int arrayLength);
    void fillArrayWithRandomNumbers(int[] array);
    void printArrayToConsole(int[] array);
    int findMaxNumber(int[] array);
    int findMinNumber(int[] array);
}
