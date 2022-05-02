package studen_natalja_isajeva.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 3 numbers: ");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            int userInput = scanner.nextInt();
            numbers[i] =userInput;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
