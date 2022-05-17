package student_arturs_melnikovs.lesson_12.level_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        int number;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number");
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Try again");
            }
        }

    }

}
