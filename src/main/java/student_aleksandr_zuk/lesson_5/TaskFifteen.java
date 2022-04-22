package student_aleksandr_zuk.lesson_5;

import java.util.Arrays;
import java.util.Random;

class TaskFifteen {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Random numbers is: " + numbers[i]);
            numbers[i] +=2;
        }
        System.out.println("Numbers increased by two: " + Arrays.toString(numbers));
    }
}
