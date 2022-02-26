package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class TaskFifteen {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.print(numbers[i]);
            numbers[i] = numbers[i] + 2;
            System.out.println(" + 2 = " + numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }

}
