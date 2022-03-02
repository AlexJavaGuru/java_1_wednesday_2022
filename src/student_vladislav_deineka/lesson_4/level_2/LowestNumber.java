package student_vladislav_deineka.lesson_4.level_2;

import java.util.Scanner;

public class LowestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int secondNumber = scanner.nextInt();

        if (number < secondNumber) {
            System.out.println(number);
        } else {
            System.out.println(secondNumber);
        }
    }
}
