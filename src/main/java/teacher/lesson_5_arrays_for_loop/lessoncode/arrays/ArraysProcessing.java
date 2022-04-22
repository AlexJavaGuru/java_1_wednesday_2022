package teacher.lesson_5_arrays_for_loop.lessoncode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length...");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            int userInput = scanner.nextInt();
            numbers[i] = userInput;
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum is: " + sum);

        //for each
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
