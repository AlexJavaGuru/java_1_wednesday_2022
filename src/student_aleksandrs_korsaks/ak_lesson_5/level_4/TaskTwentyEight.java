package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import java.util.Random;

class TaskTwentyEight {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("Array`s element nr. " + (i + 1) + " = " + numbers[i]);
        }

        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Min Array`s elements is: " + min);
    }
}
