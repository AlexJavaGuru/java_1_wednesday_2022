package student_arturs_melnikovs.lesson_02.level_1;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the 1st number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter the 2nd number:");
        int secondNumber = scanner.nextInt();

        int summResult = firstNumber + secondNumber;
        int subResult = firstNumber - secondNumber;
        int multResult = firstNumber * secondNumber;
        double divResult = firstNumber / (double) secondNumber;

        System.out.println("Summation result: " + summResult);
        System.out.println("Subtraction result: " + subResult);
        System.out.println("Multiplication result: " + multResult);
        System.out.println("Division result: " + divResult);
    }
}
