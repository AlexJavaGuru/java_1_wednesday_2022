package studen_natalja_isajeva.lesson_5.levels_5_6;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    // Task33
    public void fillArrayWithRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(10);
        }
    }

    // Task34
    public void printArrayToConsole(int[] arrayConsole) {
        System.out.println(Arrays.toString(arrayConsole));

    }

    // Task 35
    public int findMaxNumber(int[] array) {
            int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    // Task 37
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

}