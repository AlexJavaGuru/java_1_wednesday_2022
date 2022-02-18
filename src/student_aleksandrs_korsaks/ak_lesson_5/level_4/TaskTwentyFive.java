package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class TaskTwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Array`s length");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please, enter integer for array`s element nr. " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
