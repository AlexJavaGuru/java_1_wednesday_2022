package student_nadezda_travkina.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array length: ");

        int numbers[] = new int[scanner.nextInt()];
        System.out.print("Insert array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Inserted array elements: " + (Arrays.toString(numbers)));
    }
}

