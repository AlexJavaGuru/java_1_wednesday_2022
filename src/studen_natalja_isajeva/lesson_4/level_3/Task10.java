package studen_natalja_isajeva.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Type second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("Type third number :");
        int thirdNumber = scanner.nextInt();

        if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println("Number " + thirdNumber + " is bigger number!");
        } else if (firstNumber < secondNumber) {
            System.out.println("Number " + secondNumber + " is bigger number!");
        } else if (firstNumber > thirdNumber && firstNumber > secondNumber) {
            System.out.println("Number " + firstNumber + " is bigger number!");
        }  else {
            System.out.println("Number " + firstNumber + " is bigger number!");
        }
    }
}
