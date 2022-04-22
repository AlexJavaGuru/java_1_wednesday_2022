package student_aleksandrs_korsaks.ak_lesson_5.level_2;

import java.util.Random;

class TaskThirteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Array`s element nr. " + (i + 1) + " = " + numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Sum of all Array`s elements is - " + sum);
    }
}

