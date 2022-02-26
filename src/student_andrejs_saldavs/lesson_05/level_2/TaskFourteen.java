package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskFourteen {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        double avg = 0;

        for (int i = 0; i < numbers.length ; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
            avg += numbers[i];

        }

        System.out.println(avg);

        System.out.println(Arrays.toString(numbers));
    }

}
