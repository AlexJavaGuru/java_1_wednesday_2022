package studen_natalja_isajeva.lesson_4.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Type second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("Type third number :");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("Increasing");
        } else if ((firstNumber > secondNumber) && (thirdNumber < secondNumber)) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
