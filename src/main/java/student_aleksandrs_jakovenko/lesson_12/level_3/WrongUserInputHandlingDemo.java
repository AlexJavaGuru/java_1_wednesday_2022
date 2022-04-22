package student_aleksandrs_jakovenko.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        int number;
        boolean isNumber = true;
        System.out.println("Enter number: ");

        while (isNumber) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Your number is: " + number);
                isNumber = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: InputMismatchException\nEnter number again:");
            }
        }
    }
}
