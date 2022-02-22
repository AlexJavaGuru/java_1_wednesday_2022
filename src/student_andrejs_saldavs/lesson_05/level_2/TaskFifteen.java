package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskFifteen {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        numbers[0] = numbers[0] + 2;
        numbers[1] = numbers[1] + 2;
        numbers[2] = numbers[2] + 2;
        System.out.println(Arrays.toString(numbers));
    }

}
