package student_aleksandr_zuk.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        int number;
        boolean isNumber = true;
        System.out.println("Enter the number...");

        while (isNumber) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Your number is: " + number);
                isNumber = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: InputMismatchException , Enter number again");
            }
        }
    }
}
