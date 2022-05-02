package student_nadezda_travkina.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task_27 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(8);
        }
        System.out.println("All numbers are: " + Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min number is: " + max);
    }
}
