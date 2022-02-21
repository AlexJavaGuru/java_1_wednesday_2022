package student_aleksejs_iljins.lesson_05.level_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
    }
    public void printArrayToConsole(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
    public int findMaxNumber(int[] array) {
        int max = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
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
