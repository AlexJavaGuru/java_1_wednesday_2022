package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import java.util.Random;

public class TaskTwentySeven {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("Array`s element nr. " + (i + 1) + " = " + numbers[i]);
        }

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max Array`s element is: " + max);
    }
}
