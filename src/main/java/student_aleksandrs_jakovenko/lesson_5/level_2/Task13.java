package student_aleksandrs_jakovenko.lesson_5.level_2;

import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
