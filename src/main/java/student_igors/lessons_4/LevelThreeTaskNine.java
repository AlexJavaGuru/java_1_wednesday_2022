package student_igors.lessons_4;

import java.util.Scanner;

public class LevelThreeTaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int number3 = scanner.nextInt();


        if ((number1 < number2) && (number2 < number3)) {
            System.out.println("increasing");
        } else if ((number1 > number2) && (number2 > number3)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

//    Write a program that accepts three numbers from the user and prints:
//    - "increasing" if the numbers are in increasing order,
//    - "decreasing" if the numbers are in decreasing order,
//    - "Neither increasing or decreasing order" otherwise.