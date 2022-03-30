package student_arturs_melnikovs.lesson_05.level_05;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for(int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for(int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    public void printEvenNumbers(int[] array) {
        System.out.println("Even numbers: ");
        for (int number : array) {
            if(number % 2 == 0) {
                System.out.println( + number);
            }
        }
    }

    public void printOddNumbers(int[] array) {
        System.out.println("Odd numbers: ");
        for (int number : array) {
            if(number % 2 != 0) {
                System.out.println( + number);
            }
        }
    }


}
