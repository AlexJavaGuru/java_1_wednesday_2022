package student_andrejs_saldavs.lesson_05.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwentyFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array length: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();
            numbers[i] = userInput;
        }

        System.out.println(Arrays.toString(numbers));
    }

}
