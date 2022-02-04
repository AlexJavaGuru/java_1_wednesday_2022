package student_darja_soroka.lesson_02.level_01;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number");
        int secondNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtResult = firstNumber - secondNumber;
        int multResult = firstNumber * secondNumber;
        double divResult = firstNumber / (double) secondNumber;

        System.out.println("Result of Addition: " + sumResult);
        System.out.println("Result of Subtraction: " + subtResult);
        System.out.println("Result of Multiplication: " + multResult);
        System.out.println("Result of Division: " + divResult);

    }
}
