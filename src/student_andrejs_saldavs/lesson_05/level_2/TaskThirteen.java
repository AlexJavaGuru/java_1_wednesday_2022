package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskThirteen {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum =+ numbers[i];
        }
        System.out.println(sum);
    }

}
