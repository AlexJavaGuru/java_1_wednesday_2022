package student_vladislav_deineka.lesson_4.level_3;

import java.util.Scanner;

public class EqualNotEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int thirdNumber = scanner.nextInt();

        if (number == thirdNumber && number == secondNumber) {
            System.out.println("Numbers are equal");
        } else if (number != secondNumber && secondNumber != thirdNumber && number != thirdNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
