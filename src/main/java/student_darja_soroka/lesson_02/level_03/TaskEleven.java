package student_darja_soroka.lesson_02.level_03;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter integer");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter integer");
        int thirdNumber = scanner.nextInt();
        double average = (double) (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average is " + average);
    }
}
