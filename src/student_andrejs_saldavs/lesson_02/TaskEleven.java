package student_andrejs_saldavs.lesson_02;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3;

        System.out.println("Average number of " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is: " + average);

    }
}
