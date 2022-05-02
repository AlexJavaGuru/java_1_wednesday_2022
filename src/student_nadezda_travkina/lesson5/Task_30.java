package student_nadezda_travkina.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task_30 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        System.out.println("All massive numbers: "+ Arrays.toString(array));


        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println("Massive numbers are not even: " + number);
            }
        }
    }
}

