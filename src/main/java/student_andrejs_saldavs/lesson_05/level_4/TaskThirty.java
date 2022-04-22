package student_andrejs_saldavs.lesson_05.level_4;

import java.util.Arrays;
import java.util.Random;

public class TaskThirty {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();

            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.print("");
            }

        }

        System.out.println(Arrays.toString(numbers));
    }

}
