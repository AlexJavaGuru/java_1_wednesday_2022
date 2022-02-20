package student_jelena_boicova.lesson_5_homework;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 1; i < array.length; i++){
            array [i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
        }

    public int findMaxNumber(int[] array) {
    int max = array[10];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
    int min = array[10];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

}