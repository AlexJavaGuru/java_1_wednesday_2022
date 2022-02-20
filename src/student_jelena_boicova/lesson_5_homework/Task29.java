package student_jelena_boicova.lesson_5_homework;

import java.util.Arrays;
import java.util.Random;

public class Task29 {

    public static void main(String[] args) {
        int [] numbers = new int [35];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers [i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            if (number % 2 == 0) {
            System.out.println(number);
            }
        }
    }

}
