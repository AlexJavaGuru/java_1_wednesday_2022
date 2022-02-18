package student_aleksandrs_jakovenko.lesson_5.level_5;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
    }
}