package student_aleksandrs_jakovenko.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("Your number is: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
