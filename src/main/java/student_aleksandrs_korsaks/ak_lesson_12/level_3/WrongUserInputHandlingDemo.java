package student_aleksandrs_korsaks.ak_lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter Integer");
                int result = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input value, enter once again");
            }
        }
    }
}
