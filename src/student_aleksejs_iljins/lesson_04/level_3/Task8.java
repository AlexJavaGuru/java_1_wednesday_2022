package student_aleksejs_iljins.lesson_04.level_3;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("\"All numbers are equal\"");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("\"All numbers are different\"");
        } else {
        //} else if (firstNumber == secondNumber || firstNumber == thirdNumber || firstNumber != thirdNumber || secondNumber != thirdNumber) {
            System.out.println("\"Neither all are equal or different\"" );
        }
    }
}
