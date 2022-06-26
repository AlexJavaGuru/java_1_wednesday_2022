package student_nikita_visnakov.lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            int userInput = scanner.nextInt();
            number[i] = userInput;
        }
        System.out.println(Arrays.toString(number));
    }
}