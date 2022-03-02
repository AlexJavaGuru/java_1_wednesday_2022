package student_vladislav_deineka.lesson_4.level_3;

import java.util.Scanner;

public class BiggestNumberOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int thirdNumber = scanner.nextInt();

        if (number > secondNumber && number > thirdNumber) {
            System.out.println("The biggest number: " + number);
        } else if (secondNumber > thirdNumber && secondNumber > number) {
            System.out.println("The biggest number: " + secondNumber);
        } else
            System.out.println("The biggest number: " + thirdNumber);
    }
}
