package studen_natalja_isajeva.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length: ");
        int size = scanner.nextInt();

        int[] number = new int[size];

        System.out.println("Type " + size + " numbers: ");
        for (int i = 0; i < number.length; i++) {
            int userInput = scanner.nextInt();
            number[i] =userInput;
        }
        System.out.println(Arrays.toString(number));
    }
}
