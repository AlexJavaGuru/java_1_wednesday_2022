package student_aleksandrs_korsaks.ak_lesson_2.level_3;

import java.util.Scanner;

public class TaskEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the 2nd number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the 3rd number");
        int thirdNumber = scanner.nextInt();

        double averageOfNumbers = (double) (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average of these numbers is: " + Math.round(averageOfNumbers * 100.0) / 100.00);
    }
}