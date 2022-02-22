package student_andrejs_saldavs.lesson_05.level_5;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {

        return new int[arrayLength];

    }

    public void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array [i] = random.nextInt();
        }

    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

}
