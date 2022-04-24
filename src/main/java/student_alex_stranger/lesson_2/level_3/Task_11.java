package student_alex_stranger.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the socond number;");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();
        double result = ((firstNumber + secondNumber + thirdNumber) / 3);
        System.out.println("Result is:" + result);






    }
}
