package studen_natalja_isajeva.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysTask29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i]= random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
    }

    }
}
