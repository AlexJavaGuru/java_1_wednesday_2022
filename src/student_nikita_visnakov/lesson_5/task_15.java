package student_nikita_visnakov.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class task_15 {

    public static void main(String[] args) {
        int[] number = new int[3];
        for ( int i = 0; i < number.length ; i++) {
            Random random = new Random();
            number[i] = random.nextInt();
        }
        System.out.println("old arrays - " +Arrays.toString(number));
        for ( int i = 0 ; i < number.length; i++) {
            number[i] = number[i] + 2;
        }
        System.out.println("New arrays - " + Arrays.toString(number));
    }
}
