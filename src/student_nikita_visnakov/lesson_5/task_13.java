package student_nikita_visnakov.lesson_5;

import java.util.Random;

public class task_13 {

    public static void main(String[] args) {
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            Random random = new Random();
            number[i] = random.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);
    }
}
