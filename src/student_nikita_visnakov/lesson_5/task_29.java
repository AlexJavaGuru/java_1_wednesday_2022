package student_nikita_visnakov.lesson_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_29 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            if ( number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
