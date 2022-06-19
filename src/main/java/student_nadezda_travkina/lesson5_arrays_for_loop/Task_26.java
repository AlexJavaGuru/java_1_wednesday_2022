package student_nadezda_travkina.lesson5_arrays_for_loop;

import java.util.Arrays;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array length: ");

        int numbers[] = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);}
            System.out.print("Array elements: " + (Arrays.toString(numbers)));
        }
    }

