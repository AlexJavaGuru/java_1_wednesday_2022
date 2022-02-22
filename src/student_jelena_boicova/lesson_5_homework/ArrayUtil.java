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
    int maxNumber = array[0];
        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
    int minNumber = array[0];
        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}