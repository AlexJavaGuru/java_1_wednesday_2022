package student_aleksandrs_jakovenko.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task29 {

    public static void main(String[] args) {
        int[] numbers;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int size = scanner.nextInt();
        numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            int input = random.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
