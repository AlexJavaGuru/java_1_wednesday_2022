package student_andrejs_saldavs.lesson_05.level_4;

import java.util.Arrays;
import java.util.Random;

public class TaskTwentyEight {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(numbers[0]);
        int minNumber = numbers[0];
        for (int number : numbers) {
            if (minNumber > number) {
                minNumber = number;
            }
        }
        System.out.println(minNumber);

    }

}
