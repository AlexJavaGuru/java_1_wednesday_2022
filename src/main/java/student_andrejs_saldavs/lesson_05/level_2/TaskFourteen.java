package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskFourteen {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        double avg = 0;
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            avg = sum/3;
        }

        System.out.println(avg);

        System.out.println(Arrays.toString(numbers));
    }

}
