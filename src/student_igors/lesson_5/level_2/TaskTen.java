package student_igors.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size :");
        int size = scanner.nextInt();
        int[] number = new int[size];
        System.out.println("Enter your number :");


        for (int i = 0; i < number.length; i++){
            int userInput = scanner.nextInt();
            number[i] = userInput;
        }
        System.out.println(Arrays.toString(number));
    }
}
