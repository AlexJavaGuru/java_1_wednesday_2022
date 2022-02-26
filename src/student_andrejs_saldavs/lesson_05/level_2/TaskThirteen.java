package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskThirteen {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
            sum =+ numbers[i];
        }
        System.out.println(sum);
    }

}
