package student_andrejs_saldavs.lesson_02;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double thirdNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3;

        System.out.println("Average number of " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is: " + average);

    }
}
