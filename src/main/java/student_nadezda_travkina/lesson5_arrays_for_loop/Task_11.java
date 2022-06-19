package student_nadezda_travkina.lesson5_arrays_for_loop;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number ");
        numbers[0] = scanner.nextInt();
        System.out.println("Type second number ");
        numbers[1] = scanner.nextInt();
        System.out.println("Type third number ");
        numbers[2] = scanner.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
