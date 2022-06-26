package student_nikita_visnakov.lesson_5;

import student_nadezda_travkina.lesson1.ScannerExample;

import java.util.Arrays;
import java.util.Scanner;

public class task_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length...");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value for arrays..");
            int userInput = scanner.nextInt();
            numbers[i] = userInput;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
