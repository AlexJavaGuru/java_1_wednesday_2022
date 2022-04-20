package student_aleksandr_zuk.lesson_5;

import java.util.Arrays;
import java.util.Random;

class TaskFourteen {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10);
            System.out.println("Arrays numbers is: " +numbers[i]);
            sum += numbers[i];

        }
        System.out.println("Average arrays number is:" + sum / numbers.length);






    }
}
