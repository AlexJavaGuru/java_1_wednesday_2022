package student_nikita_visnakov.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
    }
    public void printArray(int[] array) {

        System.out.println(Arrays.toString(array));
    }
    public void arrayMaxNumber(int [] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > maxNum );
            maxNum = array[i];
        }
    }
    public void arrayMinNumber(int [] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length;i++) {
            if ( array[i] < minNum);
            minNum = array[i];
        }
    }
}