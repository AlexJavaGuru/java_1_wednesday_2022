package student_vladislav_deineka.lesson_4.level_3;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int thirdNumber = scanner.nextInt();

        if (number < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing order");
        } else if (number > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
