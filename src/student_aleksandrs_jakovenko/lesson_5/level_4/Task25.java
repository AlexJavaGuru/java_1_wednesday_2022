package student_aleksandrs_jakovenko.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {
        int[] numbers;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int size = scanner.nextInt();
        numbers = new int[size];
        System.out.println("Enter numbers:");

        for (int i = 0; i < numbers.length; i++) {
            int input = scanner.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
