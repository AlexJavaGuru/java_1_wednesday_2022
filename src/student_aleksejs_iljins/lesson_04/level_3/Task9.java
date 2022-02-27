package student_aleksejs_iljins.lesson_04.level_3;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("\"Increasing\"");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("\"Decreasing\"");
        } else {
        //} else if (firstNumber > secondNumber || secondNumber < thirdNumber || firstNumber < secondNumber || secondNumber > thirdNumber || firstNumber == secondNumber || secondNumber == thirdNumber) {
            System.out.println("\"Neither increasing or decreasing order\"" );
        }
    }
}
