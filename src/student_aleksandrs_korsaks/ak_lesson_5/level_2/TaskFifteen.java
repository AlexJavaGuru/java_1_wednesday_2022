package student_aleksandrs_korsaks.ak_lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskFifteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Array`s element nr. " + (i + 1) + " = " + numbers[i]);
            //output variant 1
            numbers[i] += 2;
            System.out.println("Array`s element nr. " + (i + 1) + " (+ 2) = " + numbers[i]);
        }
        //output v-2
        System.out.println();
        System.out.println("Array`s element + 2 = " + Arrays.toString(numbers));
    }
}
