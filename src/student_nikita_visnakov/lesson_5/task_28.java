package student_nikita_visnakov.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class task_28 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int minNum = numbers[0];
        for (int number : numbers) {
            if ( number < minNum)
                minNum = number;
        }
        System.out.println(minNum);
    }
}
