package student_andrejs_saldavs.lesson_05.level_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TaskTwentySeven {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(numbers[4]);

    }

}
