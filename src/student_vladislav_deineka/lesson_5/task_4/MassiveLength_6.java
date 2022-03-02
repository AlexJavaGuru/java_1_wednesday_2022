package student_vladislav_deineka.lesson_5.task_4;

import java.util.Arrays;
import java.util.Random;

public class MassiveLength_6 {
    public static void main(String[] args) {

        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random2 = new Random();
        int length = random2.nextInt(diff + 1);

        int[] numbers = new int[length];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomInput = random.nextInt();
            numbers[i] = randomInput;
        }
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}