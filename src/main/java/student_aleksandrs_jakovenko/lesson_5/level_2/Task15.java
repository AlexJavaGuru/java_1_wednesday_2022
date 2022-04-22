package student_aleksandrs_jakovenko.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
