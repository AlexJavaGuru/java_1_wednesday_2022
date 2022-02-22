package student_aleksandrs_jakovenko.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task27 {

    public static void main(String[] args) {
        int[] numbers;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int size = scanner.nextInt();
        numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = numbers[0];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number = " + max);
    }
}
