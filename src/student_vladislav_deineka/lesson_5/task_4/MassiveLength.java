package student_vladislav_deineka.lesson_5.task_4;

import java.util.Scanner;
import java.util.Arrays;

public class MassiveLength {
    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            int userInput = scanner.nextInt();
            numbers[i] = userInput;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
