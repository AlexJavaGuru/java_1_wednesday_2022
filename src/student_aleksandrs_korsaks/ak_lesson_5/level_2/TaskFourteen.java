package student_aleksandrs_korsaks.ak_lesson_5.level_2;

import java.util.Random;

class TaskFourteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Array`s element nr. " + (i + 1) + " = " + numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Average of Array`s element - " + Math.round((sum / numbers.length) * 100.00) / 100.00);
    }
}