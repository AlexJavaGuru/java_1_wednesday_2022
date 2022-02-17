package student_aleksandrs_jakovenko.lesson_5.level_2;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
            avg = numbers[i]/ numbers.length;
        }
        System.out.println(avg);
    }
}
